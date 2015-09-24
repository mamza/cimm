package ca.cimm.apps.dev.persistence;

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
	@Rollback(value = false)
	public void testCreate() {
		Product product = new Product();
		product.setBarCode("#00001111");
		product.setName("Product Name");
		product.setTags("tag1, tag2, tag3, tag4");

		Long id = productDao.create(product);
		Assert.assertNotNull(id);
		Assert.assertEquals(id, product.getId());
		Assert.assertEquals(product, em.find(Product.class, id));
		em.flush();
		String name = "Product Name Changed";
		product.setName(name);
		productDao.update(product);
		Assert.assertEquals(name, product.getName());
		Assert.assertEquals(product, em.find(Product.class, id));

	}
}
