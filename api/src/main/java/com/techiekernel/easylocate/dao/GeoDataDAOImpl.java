package com.techiekernel.easylocate.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.techiekernel.easylocate.pojo.GeoData;

@Repository
public class GeoDataDAOImpl implements GeoDataDAO {

	@Autowired(required=true)
	private SessionFactory sessionFactory;

	public GeoData getGeoData(Integer id) {
		return (GeoData) sessionFactory.getCurrentSession().get(GeoData.class,
				id);
	}

	public List<GeoData> getGeoDatas() {
		return sessionFactory.getCurrentSession().createQuery("from GeoData")
				.list();
	}

	public void saveOrUpdateGeoData(GeoData geoData) {
		sessionFactory.getCurrentSession().saveOrUpdate(geoData);
	}

	public void deleteGeoData(Integer id) {
		GeoData geoData = (GeoData) sessionFactory.getCurrentSession().load(
				GeoData.class, id);
		if (null != geoData) {
			sessionFactory.getCurrentSession().delete(geoData);
		}
	}

}
