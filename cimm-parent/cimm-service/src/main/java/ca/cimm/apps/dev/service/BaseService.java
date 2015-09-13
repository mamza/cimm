package ca.cimm.apps.dev.service;

import java.util.List;

import ca.cimm.apps.dev.domain.AbstractPojo;

public interface BaseService<T extends AbstractPojo> {
	T get(Long id);
	Long create(T t);
	T update(T t);
	void delete(T t);
	List<T> findAll();
	List<T> find(int start, int count);
}
