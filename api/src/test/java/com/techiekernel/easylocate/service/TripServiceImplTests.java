package com.techiekernel.easylocate.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

import com.techiekernel.easylocate.pojo.Trip;

public class TripServiceImplTests {
	
	private TripService tripServices;
	
	public TripServiceImplTests() {
		tripServices = Mockito.mock(TripService.class);
		Mockito.when(tripServices.getTrip(1)).thenReturn(new Trip());
		Mockito.when(tripServices.getTrips()).thenReturn(new ArrayList<Trip>());
		Mockito.when(tripServices.saveOrUpdateTrip(Mockito.any(Trip.class))).thenReturn(true);
		Mockito.when(tripServices.deleteTrip(1)).thenReturn(true);
	}

	@Test
	public void testGetTrip() {
		Trip geoData = tripServices.getTrip(1);
		assertNotNull(geoData);
	}

	@Test
	public void testGetTrips() {
		List<Trip> geoDatas = tripServices.getTrips();
		assertNotNull(geoDatas);
	}

	@Test
	public void testSaveOrUpdateTrip() {
		assertTrue(tripServices.saveOrUpdateTrip(new Trip()));
	}

	@Test
	public void testDeleteTrip() {
		assertTrue(tripServices.deleteTrip(1));
	}

}
