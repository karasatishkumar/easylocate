package com.techiekernel.easylocate.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.OptimisticLockType;

@Entity
@org.hibernate.annotations.Entity(dynamicUpdate = true)
@Table(name = "GEODATA")
public class GeoData implements Serializable {

	private static final long serialVersionUID = -1798070786993154676L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "GEODATA_ID", unique = true, nullable = false)
	private Integer geoDataId;

	@Column(name = "GEODATA_USER", unique = false, nullable = false)
	private Integer geoDataUser;

	@Column(name = "GEODATA_TRIP", unique = false, nullable = true)
	private Integer geoDataTrip;

	@Column(name = "GEODATA_LATITUDE", unique = false, nullable = true, length = 100)
	private String geoDataLat;

	@Column(name = "GEODATA_LONGITUDE", unique = false, nullable = true, length = 100)
	private String geoDataLng;

	@Column(name = "GEODATA_ALTITUDE", unique = false, nullable = true, length = 100)
	private String geoDataAlt;

	@Column(name = "GEODATA_ACCURACY", unique = false, nullable = true, length = 100)
	private String geoDataAccuracy;

	@Column(name = "GEODATA_ALT_ACCURACY", unique = false, nullable = true, length = 100)
	private String geoDataAltAccuracy;

	@Column(name = "GEODATA_SPEED", unique = false, nullable = true, length = 100)
	private String geoDataSpeed;

	@Column(name = "GEODATA_HEADING", unique = false, nullable = true, length = 100)
	private String geoDataHeading;

	@Column(name = "GEODATA_TIME", unique = false, nullable = false)
	private Date geoDataTime;

	/**
	 * @return the geoDataId
	 */
	public Integer getGeoDataId() {
		return geoDataId;
	}

	/**
	 * @param geoDataId
	 *            the geoDataId to set
	 */
	public void setGeoDataId(Integer geoDataId) {
		this.geoDataId = geoDataId;
	}

	/**
	 * @return the geoDataUser
	 */
	public Integer getGeoDataUser() {
		return geoDataUser;
	}

	/**
	 * @param geoDataUser
	 *            the geoDataUser to set
	 */
	public void setGeoDataUser(Integer geoDataUser) {
		this.geoDataUser = geoDataUser;
	}

	/**
	 * @return the geoDataTrip
	 */
	public Integer getGeoDataTrip() {
		return geoDataTrip;
	}

	/**
	 * @param geoDataTrip
	 *            the geoDataTrip to set
	 */
	public void setGeoDataTrip(Integer geoDataTrip) {
		this.geoDataTrip = geoDataTrip;
	}

	/**
	 * @return the geoDataLat
	 */
	public String getGeoDataLat() {
		return geoDataLat;
	}

	/**
	 * @param geoDataLat
	 *            the geoDataLat to set
	 */
	public void setGeoDataLat(String geoDataLat) {
		this.geoDataLat = geoDataLat;
	}

	/**
	 * @return the geoDataLng
	 */
	public String getGeoDataLng() {
		return geoDataLng;
	}

	/**
	 * @param geoDataLng
	 *            the geoDataLng to set
	 */
	public void setGeoDataLng(String geoDataLng) {
		this.geoDataLng = geoDataLng;
	}

	/**
	 * @return the geoDataAlt
	 */
	public String getGeoDataAlt() {
		return geoDataAlt;
	}

	/**
	 * @param geoDataAlt
	 *            the geoDataAlt to set
	 */
	public void setGeoDataAlt(String geoDataAlt) {
		this.geoDataAlt = geoDataAlt;
	}

	/**
	 * @return the geoDataAccuracy
	 */
	public String getGeoDataAccuracy() {
		return geoDataAccuracy;
	}

	/**
	 * @param geoDataAccuracy
	 *            the geoDataAccuracy to set
	 */
	public void setGeoDataAccuracy(String geoDataAccuracy) {
		this.geoDataAccuracy = geoDataAccuracy;
	}

	/**
	 * @return the geoDataAltAccuracy
	 */
	public String getGeoDataAltAccuracy() {
		return geoDataAltAccuracy;
	}

	/**
	 * @param geoDataAltAccuracy
	 *            the geoDataAltAccuracy to set
	 */
	public void setGeoDataAltAccuracy(String geoDataAltAccuracy) {
		this.geoDataAltAccuracy = geoDataAltAccuracy;
	}

	/**
	 * @return the geoDataSpeed
	 */
	public String getGeoDataSpeed() {
		return geoDataSpeed;
	}

	/**
	 * @param geoDataSpeed
	 *            the geoDataSpeed to set
	 */
	public void setGeoDataSpeed(String geoDataSpeed) {
		this.geoDataSpeed = geoDataSpeed;
	}

	/**
	 * @return the geoDataHeading
	 */
	public String getGeoDataHeading() {
		return geoDataHeading;
	}

	/**
	 * @param geoDataHeading
	 *            the geoDataHeading to set
	 */
	public void setGeoDataHeading(String geoDataHeading) {
		this.geoDataHeading = geoDataHeading;
	}

	/**
	 * @return the geoDataTime
	 */
	public Date getGeoDataTime() {
		return geoDataTime;
	}

	/**
	 * @param geoDataTime
	 *            the geoDataTime to set
	 */
	public void setGeoDataTime(Date geoDataTime) {
		this.geoDataTime = geoDataTime;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GeoData [geoDataId=" + geoDataId + ", geoDataUser="
				+ geoDataUser + ", geoDataTrip=" + geoDataTrip
				+ ", geoDataLat=" + geoDataLat + ", geoDataLng=" + geoDataLng
				+ ", geoDataAlt=" + geoDataAlt + ", geoDataAccuracy="
				+ geoDataAccuracy + ", geoDataAltAccuracy="
				+ geoDataAltAccuracy + ", geoDataSpeed=" + geoDataSpeed
				+ ", geoDataHeading=" + geoDataHeading + ", geoDataTime="
				+ geoDataTime + ", toString()=" + super.toString() + "]";
	}
}