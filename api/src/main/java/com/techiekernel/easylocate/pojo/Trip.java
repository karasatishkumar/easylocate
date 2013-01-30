package com.techiekernel.easylocate.pojo;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.OptimisticLockType;

@Entity
@org.hibernate.annotations.Entity(dynamicUpdate = true)
@Table(name = "TRIP")
public class Trip implements Serializable {

	private static final long serialVersionUID = -1798070786993154676L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TRIP_ID", unique = true, nullable = false)
	private Integer tripId;

	@Column(name = "TRIP_USER", unique = false, nullable = false)
	private Integer tripUser;

	@Column(name = "TRIP_NAME", unique = false, nullable = false, length = 100)
	private String roleName;

	@OneToMany
	@JoinColumn(name = "tripId")
	private Set<GeoData> geoData;

	/**
	 * @return the tripId
	 */
	public Integer getTripId() {
		return tripId;
	}

	/**
	 * @param tripId
	 *            the tripId to set
	 */
	public void setTripId(Integer tripId) {
		this.tripId = tripId;
	}

	/**
	 * @return the tripUser
	 */
	public Integer getTripUser() {
		return tripUser;
	}

	/**
	 * @param tripUser
	 *            the tripUser to set
	 */
	public void setTripUser(Integer tripUser) {
		this.tripUser = tripUser;
	}

	/**
	 * @return the roleName
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * @param roleName
	 *            the roleName to set
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/**
	 * @return the geoData
	 */
	public Set<GeoData> getGeoData() {
		return geoData;
	}

	/**
	 * @param geoData
	 *            the geoData to set
	 */
	public void setGeoData(Set<GeoData> geoData) {
		this.geoData = geoData;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Trip [tripId=" + tripId + ", tripUser=" + tripUser
				+ ", roleName=" + roleName + ", geoData=" + geoData
				+ ", toString()=" + super.toString() + "]";
	}
}