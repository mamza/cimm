package ca.cimm.apps.dev.persistence.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import ca.cimm.apps.dev.domain.Customer;
import ca.cimm.apps.dev.exception.TechnicalException;
import ca.cimm.apps.dev.persistence.CustomerDao;

@Repository
public class CustomerDaoImpl extends BaseDaoImpl<Customer>implements CustomerDao {

	public CustomerDaoImpl() {
		super(Customer.class);
	}

	@Override
	public List<Customer> find(int start, int count) throws TechnicalException {
		return find(start, count, Customer.PROPERTY_LASTNAME);
	}
}
