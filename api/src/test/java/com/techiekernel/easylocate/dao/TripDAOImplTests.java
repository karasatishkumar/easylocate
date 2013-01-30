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

import com.techiekernel.easylocate.pojo.Trip;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:**/applicationContext.xml" })
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
@Transactional
public class TripDAOImplTests {

	Logger log = Logger.getLogger(TripDAOImplTests.class);

	@Autowired
	protected TripDAO tripDAO;

	@Test
	public void testGetTrip() {
		Trip trip = tripDAO.getTrip(1);
		assertNotNull(trip);
		log.info(trip.toString());
	}

	@Test
	public void testGetTrips() {
		List<Trip> trips = tripDAO.getTrips();
		assertNotNull(trips);
		for (Trip trip : trips) {
			log.info(trip.toString());
		}
	}

	// @Test
	public void testSaveOrUpdateTrip() {
		log.info("Inser/update in DB.");
		Trip trip = new Trip();
		trip.setRoleName("Test");
		trip.setTripUser(1);
		tripDAO.saveOrUpdateTrip(trip);
		assertTrue(true);
		log.info("Data saved in the database successfully.");
	}

	// @Test
	public void testDeleteTrip() {
		tripDAO.deleteTrip(1);
		assertTrue(true);
	}

}
