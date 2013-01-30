package com.techiekernel.easylocate.dao;

import java.util.List;

import com.techiekernel.easylocate.pojo.GeoData;

public interface GeoDataDAO {
	/**
	 * This method will get to a particular geo data depending on the id.
	 * 
	 * @param id
	 * @return
	 */
	public GeoData getGeoData(Integer id);

	/**
	 * This method will get you all the geo data
	 * 
	 * @return
	 */
	public List<GeoData> getGeoDatas();

	/**
	 * This method will save a new geo data to database.
	 * 
	 * @param geoData
	 */
	public void saveOrUpdateGeoData(GeoData geoData);

	/**
	 * This method will delete a geo data
	 * 
	 * @param id
	 */
	public void deleteGeoData(Integer id);
}
