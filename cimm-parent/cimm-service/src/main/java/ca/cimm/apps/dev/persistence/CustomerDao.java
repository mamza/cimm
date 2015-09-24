package ca.cimm.apps.dev.persistence;

import java.util.List;

import ca.cimm.apps.dev.domain.Customer;
import ca.cimm.apps.dev.exception.TechnicalException;

public interface CustomerDao extends BaseDao<Customer> {
	List<Customer> find(int start, int count) throws TechnicalException;
}
