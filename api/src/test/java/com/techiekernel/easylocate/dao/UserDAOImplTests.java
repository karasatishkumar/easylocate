package com.techiekernel.easylocate.dao;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.techiekernel.easylocate.pojo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:**/applicationContext.xml" })
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
@Transactional
public class UserDAOImplTests {

	Logger log = Logger.getLogger(UserDAOImplTests.class);

	@Autowired
	protected UserDAO userDAO;

	@Test
	public void testGetUser() {
		User user = userDAO.getUser(1);
		assertNotNull(user);
		log.info(user.toString());
	}

	@Test
	public void testGetUsers() {
		List<User> users = userDAO.getUsers();
		assertNotNull(users);
		for (User user : users) {
			log.info(user.toString());
		}
	}

	// @Test
	public void testSaveOrUpdateUser() {
		log.info("Inser/update in DB.");
		User user = new User();
		user.setUserLastUpdated(new Date());
		user.setUserMail("satish@techiekernel.com");
		user.setUserPhone("9886899334");
		userDAO.saveOrUpdateUser(user);
		assertTrue(true);
		log.info("Data saved in the database successfully.");
	}

	// @Test
	public void testDeleteUser() {
		userDAO.deleteUser(1);
		assertTrue(true);
	}

}
