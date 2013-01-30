package com.techiekernel.easylocate.pojo;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.OptimisticLockType;

/**
 * @author satish
 * 
 */
@Entity
@org.hibernate.annotations.Entity(dynamicUpdate = true)
@Table(name = "USER", uniqueConstraints = {
		@UniqueConstraint(columnNames = "USER_ID"),
		@UniqueConstraint(columnNames = "USER_PHONE"),
		@UniqueConstraint(columnNames = "USER_EMAIL") })
public class User implements Serializable {

	private static final long serialVersionUID = -1798070786993154676L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID", unique = true, nullable = false)
	private Integer userId;

	@OneToOne
	@JoinColumn(name = "USER_ROLE")
	private Role role;

	@OneToOne
	@JoinColumn(name = "USER_PASSWORD")
	private Password password;

	@Column(name = "USER_NAME", unique = false, nullable = false, length = 200)
	private String userName;

	@Column(name = "USER_PHONE", unique = false, nullable = false, length = 25)
	private String userPhone;

	@Column(name = "USER_EMAIL", unique = false, nullable = false, length = 50)
	private String userMail;

	@Lob
	@Column(name = "USER_PHOTO", unique = false, nullable = true)
	private Blob content;

	@Column(name = "USER_LAST_UPDATED", unique = false, nullable = false)
	private Date userLastUpdated;

	@OneToMany
	@JoinColumn(name = "userId")
	private Set<GeoData> geoData;

	@OneToMany
	@JoinColumn(name = "userId")
	private Set<Trip> tripdata;

	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * @return the role
	 */
	public Role getRole() {
		return role;
	}

	/**
	 * @param role
	 *            the role to set
	 */
	public void setRole(Role role) {
		this.role = role;
	}

	/**
	 * @return the password
	 */
	public Password getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(Password password) {
		this.password = password;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the userPhone
	 */
	public String getUserPhone() {
		return userPhone;
	}

	/**
	 * @param userPhone
	 *            the userPhone to set
	 */
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	/**
	 * @return the userMail
	 */
	public String getUserMail() {
		return userMail;
	}

	/**
	 * @param userMail
	 *            the userMail to set
	 */
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	/**
	 * @return the content
	 */
	public Blob getContent() {
		return content;
	}

	/**
	 * @param content
	 *            the content to set
	 */
	public void setContent(Blob content) {
		this.content = content;
	}

	/**
	 * @return the userLastUpdated
	 */
	public Date getUserLastUpdated() {
		return userLastUpdated;
	}

	/**
	 * @param userLastUpdated
	 *            the userLastUpdated to set
	 */
	public void setUserLastUpdated(Date userLastUpdated) {
		this.userLastUpdated = userLastUpdated;
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

	/**
	 * @return the tripdata
	 */
	public Set<Trip> getTripdata() {
		return tripdata;
	}

	/**
	 * @param tripdata
	 *            the tripdata to set
	 */
	public void setTripdata(Set<Trip> tripdata) {
		this.tripdata = tripdata;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [userId=" + userId + ", role=" + role + ", password="
				+ password + ", userName=" + userName + ", userPhone="
				+ userPhone + ", userMail=" + userMail + ", content=" + content
				+ ", userLastUpdated=" + userLastUpdated + ", geoData="
				+ geoData + ", tripdata=" + tripdata + ", toString()="
				+ super.toString() + "]";
	}

}