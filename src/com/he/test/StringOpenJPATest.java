package com.he.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.he.model.TbDataAuth;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class StringOpenJPATest extends TestBase{

	// 使用注解的方式注入，3.1以前版本使用JpaDaoSupport和JpaTemplate实现
//	@PersistenceContext
//	private EntityManager entityManager;

	@Test
	public void doTest() {
		System.out.println("=====Hello OpenJPA " + entityManager + "=======");
		TbDataAuth tbDataAuth = new TbDataAuth();
		tbDataAuth.setName("he");
		tbDataAuth.setPwd("123");
		entityManager.getTransaction().begin();
		entityManager.persist(tbDataAuth);
		entityManager.getTransaction().commit();
		
		
		
		
//		final Company foundCompany = (Company) em.createQuery(
//                "select c from Company c where c.name=?1").setParameter(1,
//                "The Company").getSingleResult();
// 
//        assertEquals("D Rd.", foundCompany.getAddress().getStreetAddress1());
		
		
//		final List<Person> list = em.createQuery("select p from Person p")
//                .getResultList();
// 
//        assertEquals(2, list.size());
//        for (Person current : list) {
//            final String firstName = current.getFirstName();
//            final String streetAddress1 = current.getAddress()
//                    .getStreetAddress1();
// 
//            assertTrue(firstName.equals("Brett")
//                    || firstName.equals("FirstName"));
//            assertTrue(streetAddress1.equals("A Rd.")
//                    || streetAddress1.equals("B Rd."));
//        }
	}

}
