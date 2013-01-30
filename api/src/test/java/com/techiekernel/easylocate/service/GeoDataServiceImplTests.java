package com.techiekernel.easylocate.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

import com.techiekernel.easylocate.pojo.GeoData;

public class GeoDataServiceImplTests {
	
	private GeoDataService geoDataService;
	
	public GeoDataServiceImplTests() {
		geoDataService = Mockito.mock(GeoDataService.class);
		Mockito.when(geoDataService.getGeoData(1)).thenReturn(new GeoData());
		Mockito.when(geoDataService.getGeoDatas()).thenReturn(new ArrayList<GeoData>());
		Mockito.when(geoDataService.saveOrUpdateGeoData(Mockito.any(GeoData.class))).thenReturn(true);
		Mockito.when(geoDataService.deleteGeoData(1)).thenReturn(true);
	}

	@Test
	public void testGetGeoData() {
		GeoData geoData = geoDataService.getGeoData(1);
		assertNotNull(geoData);
	}

	@Test
	public void testGetGeoDatas() {
		List<GeoData> geoDatas = geoDataService.getGeoDatas();
		assertNotNull(geoDatas);
	}

	@Test
	public void testSaveOrUpdateGeoData() {
		assertTrue(geoDataService.saveOrUpdateGeoData(new GeoData()));
	}

	@Test
	public void testDeleteGeoData() {
		assertTrue(geoDataService.deleteGeoData(1));
	}

}
