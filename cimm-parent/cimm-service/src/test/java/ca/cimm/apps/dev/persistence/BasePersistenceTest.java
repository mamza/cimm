package ca.cimm.apps.dev.persistence;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.Ignore;
import org.springframework.beans.factory.annotation.Autowired;

@Ignore
public class BasePersistenceTest {
	
	@PersistenceContext
	protected EntityManager em;
	
	@Autowired
	protected ProductDao productDao;
	
	@Autowired
	protected CustomerDao customerDao;
}
