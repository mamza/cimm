package ca.cimm.apps.dev.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ca.cimm.apps.dev.domain.Customer;
import ca.cimm.apps.dev.exception.TechnicalException;
import ca.cimm.apps.dev.persistence.CustomerDao;
import ca.cimm.apps.dev.service.CustomerService;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public Customer get(Long id) {
		return customerDao.get(id);
	}

	@Override
	public Long create(Customer t) {
		return customerDao.create(t);
	}

	@Override
	public Customer update(Customer t) {
		return customerDao.update(t);
	}

	@Override
	public void delete(Customer t) {
		customerDao.delete(t);
	}

	@Override
	public List<Customer> findAll() {
		return customerDao.findAll();
	}

	@Override
	public List<Customer> find(int start, int count, String property) throws TechnicalException {
		return customerDao.find(start, count, property);
	}

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

}
