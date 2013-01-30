package com.techiekernel.easylocate.service;

import java.util.List;

import com.techiekernel.easylocate.pojo.Password;

public interface PasswordService {
	/**
	 * This method will get to a particular password depending on the id.
	 * 
	 * @param id
	 * @return
	 */
	public Password getPassword(Integer id);

	/**
	 * This method will get you all the passwords
	 * 
	 * @return
	 */
	public List<Password> getPasswords();

	/**
	 * This method will save or update a password to database.
	 * 
	 * @param password
	 */
	public boolean saveOrUpdatePassword(Password password);

	/**
	 * This method will delete a password
	 * 
	 * @param id
	 */
	public boolean deletePassword(Integer id);
}
