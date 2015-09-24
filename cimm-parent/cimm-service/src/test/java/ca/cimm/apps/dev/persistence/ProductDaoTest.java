package ca.cimm.apps.dev.persistence;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import ca.cimm.apps.dev.domain.Product;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/spring/test-persistence-context.xml" })
public class ProductDaoTest extends BasePersistenceTest {

	@Test
	@Transactional
	@Rollback
	public void testCreate() {
		Product product = new Product();
		product.setBarCode("#00001111");
		product.setName("Product Name");
		List<String> tags = Arrays.asList("tag1", "tag2", "tag3", "tag4");
		product.setTags(tags);
		
		Long id = productDao.create(product);
		Assert.assertNotNull(id);
		Assert.assertEquals(id, product.getId());
		Assert.assertEquals(product, em.find(Product.class, id));
		
		String name = "Product Name Changed";
		product.setName(name);
		Product product2 = productDao.update(product);
		Assert.assertEquals(name, product2.getName());
		Assert.assertEquals(product2, em.find(Product.class, id));
		
	}
}
