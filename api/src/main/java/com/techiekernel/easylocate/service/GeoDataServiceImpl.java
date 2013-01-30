package com.techiekernel.easylocate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.techiekernel.easylocate.dao.GeoDataDAO;
import com.techiekernel.easylocate.pojo.GeoData;

@Service
public class GeoDataServiceImpl implements GeoDataService {

	@Autowired
	private GeoDataDAO geoDataDAO;

	@Transactional(readOnly = true)
	public GeoData getGeoData(Integer id) {
		return geoDataDAO.getGeoData(id);
	}

	@Transactional(readOnly = true)
	public List<GeoData> getGeoDatas() {
		return geoDataDAO.getGeoDatas();
	}

	@Transactional(readOnly = false)
	public boolean saveOrUpdateGeoData(GeoData geoData) {
		geoDataDAO.saveOrUpdateGeoData(geoData);
		return true;
	}

	@Transactional(readOnly = false)
	public boolean deleteGeoData(Integer id) {
		geoDataDAO.deleteGeoData(id);
		return true;
	}

}
