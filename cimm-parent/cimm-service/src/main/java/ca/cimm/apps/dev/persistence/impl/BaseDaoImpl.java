package ca.cimm.apps.dev.persistence.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Root;

import ca.cimm.apps.dev.domain.AbstractPojo;
import ca.cimm.apps.dev.domain.type.OrderType;
import ca.cimm.apps.dev.persistence.BaseDao;

public class BaseDaoImpl<T extends AbstractPojo> implements BaseDao<T> {

	@PersistenceContext
	EntityManager entityManager;

	private Class<T> clazz;

	protected BaseDaoImpl(Class<T> clazz) {
		this.clazz = clazz;
	}
	
	@Override
	public T get(Long id) {
		return entityManager.find(clazz, id);
	}

	@Override
	public Long create(T t) {
		entityManager.persist(t);
		return t.getId();
	}

	@Override
	public T update(T t) {
		return entityManager.merge(t);
	}

	@Override
	public void delete(T t) {
		entityManager.remove(t);
	}

	@Override
	public List<T> findAll() {

		return findWith(0, 0, null, null);
	}

	@Override
	public List<T> find(int start, int count) {
		return findWith(start, count, null, null);
	}

	private List<T> findWith(int start, int count, OrderType orderType, String property) {
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();

		CriteriaQuery<T> criteria = criteriaBuilder.createQuery(clazz);
		Root<T> root = criteria.from(clazz);
		Path<T> expression = root.get(property);
		if (orderType != null) {
			switch (orderType) {
			case ASC:
				criteria.orderBy(criteriaBuilder.asc(expression));
				break;
			case DESC:
				criteria.orderBy(criteriaBuilder.desc(expression));
				break;
			default:
				break;
			}
		}
		List<T> results = entityManager.createQuery(criteria).getResultList();
		if (start != 0 && count != 0) {
			results = results.subList(Math.max(0, start), Math.min(results.size(), start + count));
		}
		return results;
	}

	public Class<T> getClazz() {
		return clazz;
	}
}
