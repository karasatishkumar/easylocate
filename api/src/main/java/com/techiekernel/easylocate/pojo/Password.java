package com.techiekernel.easylocate.pojo;

import java.io.Serializable;

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
@Table(name = "PASSWORD")
public class Password implements Serializable {

	private static final long serialVersionUID = -1798070786993154676L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PASSWORD_ID", unique = true, nullable = false)
	private Integer passwordId;

	@Column(name = "PASSWORD", unique = false, nullable = false, length = 20)
	private String password;

	/**
	 * @return the passwordId
	 */
	public Integer getPasswordId() {
		return passwordId;
	}

	/**
	 * @param passwordId
	 *            the passwordId to set
	 */
	public void setPasswordId(Integer passwordId) {
		this.passwordId = passwordId;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Password [passwordId=" + passwordId + ", password=" + "*************"
				+ ", toString()=" + super.toString() + "]";
	}
}