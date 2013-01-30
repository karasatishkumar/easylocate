package com.techiekernel.easylocate.service;

import java.util.List;

import com.techiekernel.easylocate.pojo.Trip;

public interface TripService {
	/**
	 * This method will get to a particular trip depending on the id.
	 * 
	 * @param id
	 * @return
	 */
	public Trip getTrip(Integer id);

	/**
	 * This method will get you all the trips
	 * 
	 * @return
	 */
	public List<Trip> getTrips();

	/**
	 * This method will save or update a trip to database.
	 * 
	 * @param trip
	 */
	public boolean saveOrUpdateTrip(Trip trip);

	/**
	 * This method will delete a trip
	 * 
	 * @param id
	 */
	public boolean deleteTrip(Integer id);
}
