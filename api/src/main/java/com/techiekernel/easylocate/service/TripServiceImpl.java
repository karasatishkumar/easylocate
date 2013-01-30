package com.techiekernel.easylocate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.techiekernel.easylocate.dao.TripDAO;
import com.techiekernel.easylocate.pojo.Trip;

@Service
public class TripServiceImpl implements TripService {
	
	@Autowired(required=true)
	private TripDAO tripDAO;

	@Transactional(readOnly = true)
	public Trip getTrip(Integer id) {
		return tripDAO.getTrip(id);
	}

	@Transactional(readOnly = true)
	public List<Trip> getTrips() {
		return tripDAO.getTrips();
	}

	@Transactional(readOnly = false)
	public boolean saveOrUpdateTrip(Trip trip) {
		tripDAO.saveOrUpdateTrip(trip);
		return true;
	}

	@Transactional(readOnly = false)
	public boolean deleteTrip(Integer id) {
		tripDAO.deleteTrip(id);
		return true;
	}

}
