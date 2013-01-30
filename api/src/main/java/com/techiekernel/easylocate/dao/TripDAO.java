package com.techiekernel.easylocate.dao;

import java.util.List;

import com.techiekernel.easylocate.pojo.Trip;

public interface TripDAO {
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
	 * This method will save a new trip to database.
	 * 
	 * @param trip
	 */
	public void saveOrUpdateTrip(Trip trip);

	/**
	 * This method will delete a trip
	 * 
	 * @param id
	 */
	public void deleteTrip(Integer id);
}
