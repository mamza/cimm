package ca.cimm.apps.dev.service;

import java.util.List;

import ca.cimm.apps.dev.domain.AbstractPojo;
import ca.cimm.apps.dev.exception.TechnicalException;

public interface BaseService<T extends AbstractPojo> {
	T get(Long id);
	Long create(T t);
	T update(T t);
	void delete(T t);
	List<T> findAll();
	List<T> find(int start, int count) throws TechnicalException;
	List<T> find(int start, int count, String property) throws TechnicalException;
}
