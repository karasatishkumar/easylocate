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

import com.techiekernel.easylocate.pojo.GeoData;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:**/applicationContext.xml" })
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
@Transactional
public class GeoDataDAOImplTests {

	Logger log = Logger.getLogger(GeoDataDAOImplTests.class);

	@Autowired
	protected GeoDataDAO geoDataDAO;

	@Test
	public void testGetGeoData() {
		GeoData geoData = geoDataDAO.getGeoData(1);
		assertNotNull(geoData);
		log.info(geoData.toString());
	}

	@Test
	public void testGetGeoDatas() {
		List<GeoData> geoDatas = geoDataDAO.getGeoDatas();
		assertNotNull(geoDatas);
		for (GeoData geoData : geoDatas) {
			log.info(geoData.toString());
		}
	}

	// @Test
	public void testSaveOrUpdateGeoData() {
		log.info("Inser/update in DB.");
		GeoData geoData = new GeoData();
		geoData.setGeoDataAccuracy("test");
		geoData.setGeoDataAlt("test");
		geoData.setGeoDataAltAccuracy("test");
		geoData.setGeoDataHeading("north");
		geoData.setGeoDataLat("test");
		geoData.setGeoDataLng("test");
		geoData.setGeoDataSpeed("test");
		geoData.setGeoDataTime(new Date());
		// geoData.setGeoDataTrip(1);
		geoData.setGeoDataUser(1);
		geoDataDAO.saveOrUpdateGeoData(geoData);
		assertTrue(true);
		log.info("Data saved in the database successfully.");
	}

	// @Test
	public void testDeleteGeoData() {
		geoDataDAO.deleteGeoData(1);
		assertTrue(true);
	}

}
