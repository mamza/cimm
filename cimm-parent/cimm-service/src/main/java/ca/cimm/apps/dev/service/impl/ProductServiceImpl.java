package ca.cimm.apps.dev.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ca.cimm.apps.dev.domain.Product;
import ca.cimm.apps.dev.persistence.ProductDao;
import ca.cimm.apps.dev.service.ProductService;

public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;

	@Override
	public Product get(Long id) {
		return productDao.get(id);
	}

	@Override
	public Long create(Product t) {
		return productDao.create(t);
	}

	@Override
	public Product update(Product t) {
		return productDao.update(t);
	}

	@Override
	public void delete(Product t) {
		productDao.delete(t);
	}

	@Override
	public List<Product> findAll() {
		return productDao.findAll();
	}

	@Override
	public List<Product> find(int start, int count) {
		return productDao.find(start, count);
	}

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
}
