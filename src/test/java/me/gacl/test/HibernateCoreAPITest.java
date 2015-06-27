package me.gacl.test;

import java.util.Date;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.liang.hibernate.User;

public class HibernateCoreAPITest {
	private static SessionFactory sessionFactory;

	@BeforeClass
	public static void beforeClass() {
		sessionFactory =  new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	}

	@AfterClass
	public static void afterClass() {
		sessionFactory.close();
	}

	@Test
	public void testTeacherSave() {
		User user = new User();
		user.setName("jiuqiyuliang");
		user.setPassword("123456");
		user.setCreateTime(new Date());
		user.setExpireTime(new Date());

		Session session = sessionFactory.openSession();
		//Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();

		session.save(user);

		session.getTransaction().commit();
	}
}