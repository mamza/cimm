package ca.cimm.apps.dev.persistence;

import java.util.List;

public interface BaseDao<T> {
	
	T get(Long id);
	Long create(T t);
	T update(T t);
	void delete(T t);
	List<T> findAll();
	List<T> find(int start, int count);
}
