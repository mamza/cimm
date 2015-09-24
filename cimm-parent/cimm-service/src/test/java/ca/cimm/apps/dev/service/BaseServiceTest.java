package ca.cimm.apps.dev.service;

import org.junit.Before;
import org.junit.Ignore;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import ca.cimm.apps.dev.persistence.ProductDao;
import ca.cimm.apps.dev.service.impl.ProductServiceImpl;

@Ignore
public class BaseServiceTest {
	
	@Mock
	protected ProductDao productDao;
	
	@InjectMocks
	protected ProductServiceImpl productService;
	
	@Before
	public void setUp(){
		MockitoAnnotations.initMocks(this);
	}
}