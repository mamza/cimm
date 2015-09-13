package ca.cimm.apps.dev.persistence.impl;

import org.springframework.stereotype.Repository;

import ca.cimm.apps.dev.domain.Product;
import ca.cimm.apps.dev.persistence.ProductDao;

@Repository("productDao")
public class ProductDaoImpl extends BaseDaoImpl<Product>  implements ProductDao{

	public ProductDaoImpl() {
		super(Product.class);
	}

}
