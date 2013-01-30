package com.techiekernel.easylocate.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.techiekernel.easylocate.pojo.Trip;

@Repository
public class TripDAOImpl implements TripDAO {

	@Autowired(required=true)
	private SessionFactory sessionFactory;

	public Trip getTrip(Integer id) {
		return (Trip) sessionFactory.getCurrentSession().get(Trip.class, id);
	}

	public List<Trip> getTrips() {
		return sessionFactory.getCurrentSession().createQuery("from Trip")
				.list();
	}

	public void saveOrUpdateTrip(Trip trip) {
		sessionFactory.getCurrentSession().saveOrUpdate(trip);

	}

	public void deleteTrip(Integer id) {
		Trip trip = (Trip) sessionFactory.getCurrentSession().load(Trip.class,
				id);
		if (null != trip) {
			sessionFactory.getCurrentSession().delete(trip);
		}

	}

}
