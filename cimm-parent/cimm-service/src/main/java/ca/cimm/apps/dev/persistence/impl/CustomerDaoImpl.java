package ca.cimm.apps.dev.persistence.impl;

import org.springframework.stereotype.Repository;

import ca.cimm.apps.dev.domain.Customer;
import ca.cimm.apps.dev.persistence.CustomerDao;

@Repository
public class CustomerDaoImpl extends BaseDaoImpl<Customer> implements CustomerDao{

	public CustomerDaoImpl() {
		super(Customer.class);
	}

}
