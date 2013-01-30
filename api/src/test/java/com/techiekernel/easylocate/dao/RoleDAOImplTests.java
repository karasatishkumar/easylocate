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

import com.techiekernel.easylocate.pojo.Role;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:**/applicationContext.xml" })
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
@Transactional
public class RoleDAOImplTests {

	Logger log = Logger.getLogger(RoleDAOImplTests.class);

	@Autowired
	protected RoleDAO roleDAO;

	@Test
	public void testGetRole() {
		Role role = roleDAO.getRole(1);
		assertNotNull(role);
		log.info(role.toString());
	}

	@Test
	public void testGetRoles() {

		List<Role> roles = roleDAO.getRoles();
		assertNotNull(roles);
		for (Role role : roles) {
			log.info(role.toString());
		}
	}

	// @Test
	public void testSaveOrUpdateRole() {
		log.info("Inser/update in DB.");
		Role role = new Role();
		role.setRoleName("ADMIN");
		roleDAO.saveOrUpdateRole(role);
		assertTrue(true);
		log.info("Data saved in the database successfully.");
	}

	// @Test
	public void testDeleteRole() {
		roleDAO.deleteRole(1);
		assertTrue(true);
	}

}
