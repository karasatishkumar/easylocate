package com.techiekernel.easylocate.service;

import java.util.List;

import com.techiekernel.easylocate.pojo.GeoData;

public interface GeoDataService {
	/**
	 * This method will get to a particular geo data depending on the id.
	 * 
	 * @param id
	 * @return
	 */
	public GeoData getGeoData(Integer id);

	/**
	 * This method will get you all the geo datas
	 * 
	 * @return
	 */
	public List<GeoData> getGeoDatas();

	/**
	 * This method will save or update a geo data to database.
	 * 
	 * @param geo data
	 */
	public boolean saveOrUpdateGeoData(GeoData geodata);

	/**
	 * This method will delete a geo data
	 * 
	 * @param id
	 */
	public boolean deleteGeoData(Integer id);
}
