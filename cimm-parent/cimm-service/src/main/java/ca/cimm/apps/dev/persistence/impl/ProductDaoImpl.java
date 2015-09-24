package ca.cimm.apps.dev.persistence.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import ca.cimm.apps.dev.domain.Product;
import ca.cimm.apps.dev.exception.TechnicalException;
import ca.cimm.apps.dev.persistence.ProductDao;

@Repository
public class ProductDaoImpl extends BaseDaoImpl<Product>  implements ProductDao{

	public ProductDaoImpl() {
		super(Product.class);
	}

	@Override
	public List<Product> find(int start, int count) throws TechnicalException{
		return find(start, count, Product.PROPERTY_NAME);
	}
}
