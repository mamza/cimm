package ca.cimm.apps.dev.service;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import ca.cimm.apps.dev.domain.Product;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceTest extends BaseServiceTest {

	
	@Test
	public void testCreated() {
		Product p = new Product();
		p.setBarCode("#00001111");
		p.setName("Product Name");
		p.setTags("tag1, tag2, tag3");
		when(productDao.create(any(Product.class))).thenReturn(1L);
	    productService.create(p);
		verify(productDao, times(1)).create(p);
	}
}
