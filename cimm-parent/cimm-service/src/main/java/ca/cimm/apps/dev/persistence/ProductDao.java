package ca.cimm.apps.dev.persistence;

import java.util.List;

import ca.cimm.apps.dev.domain.Product;
import ca.cimm.apps.dev.exception.TechnicalException;

public interface ProductDao extends BaseDao<Product> {
	List<Product> find(int start, int count) throws TechnicalException;
}
