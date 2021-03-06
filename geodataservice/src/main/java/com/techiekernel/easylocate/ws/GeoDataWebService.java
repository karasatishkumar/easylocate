package com.techiekernel.easylocate.ws;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.techiekernel.easylocate.pojo.GeoData;
import com.techiekernel.easylocate.service.GeoDataService;

@Controller
@RequestMapping("/api/geodata")
public class GeoDataWebService {

	@Autowired
	GeoDataService geoDataService;

	@RequestMapping(value = "/{geoDataId}", method = RequestMethod.GET, headers = "Accept=application/json", produces = { "application/json" })
	@ResponseBody
	public GeoData getGeoData(@PathVariable int geoDataId,
			HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		return geoDataService.getGeoData(geoDataId);
	}

	@RequestMapping(method = RequestMethod.GET, headers = "Accept=application/json", produces = { "application/json" })
	@ResponseBody
	public List<GeoData> getGeoDatas(HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		return geoDataService.getGeoDatas();
	}

	@RequestMapping(method = RequestMethod.POST, headers = "Accept=application/json", produces = { "application/json" }, consumes = { "application/json" })
	@ResponseBody
	public boolean createGeoData(@RequestBody GeoData geoData,
			HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		return geoDataService.saveOrUpdateGeoData(geoData);
	}

	@RequestMapping(value = "/{geoDataId}", method = RequestMethod.PUT, headers = "Accept=application/json", produces = { "application/json" }, consumes = { "application/json" })
	@ResponseBody
	public boolean editFoobar(@RequestBody GeoData geoData,
			@PathVariable int geoDataId, HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		if (geoData.getGeoDataId() != null)
			return geoDataService.saveOrUpdateGeoData(geoData);
		else
			return false;
	}

	@RequestMapping(value = "/{geoDataId}", method = RequestMethod.DELETE, headers = "Accept=application/json", produces = { "application/json" })
	@ResponseBody
	public boolean deleteGeoData(@PathVariable int geoDataId,
			HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		return geoDataService.deleteGeoData(geoDataId);
	}

}
