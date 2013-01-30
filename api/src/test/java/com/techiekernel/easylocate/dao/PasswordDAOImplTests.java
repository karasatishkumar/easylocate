package com.techiekernel.easylocate.dao;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.techiekernel.easylocate.pojo.Password;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:**/applicationContext.xml" })
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
@Transactional
public class PasswordDAOImplTests {

	Logger log = Logger.getLogger(PasswordDAOImplTests.class);

	@Autowired
	protected PasswordDAO passwordDAO;

	@Test
	public void testGetPassword() {
		Password password = passwordDAO.getPassword(1);
		assertNotNull(password);
		log.info(password.toString());
	}

	@Test
	public void testGetPasswords() {
		List<Password> passwords = passwordDAO.getPasswords();
		assertNotNull(passwords);
		for (Password password : passwords) {
			log.info(password.toString());
		}
	}

	// @Test
	public void testSaveOrUpdatePassword() {
		log.info("Inser/update in DB.");
		Password password = new Password();
		password.setPassword("testpassword");
		passwordDAO.saveOrUpdatePassword(password);
		assertTrue(true);
		log.info("Data saved in the database successfully.");
	}

	// @Test
	public void testDeletePassword() {
		passwordDAO.deletePassword(1);
		assertTrue(true);
	}

}
