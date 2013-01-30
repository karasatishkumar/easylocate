package com.techiekernel.easylocate.dao;

import java.util.List;

import com.techiekernel.easylocate.pojo.Password;

public interface PasswordDAO {
	/**
	 * This method will get to a particular password depending on the id.
	 * 
	 * @param id
	 * @return
	 */
	public Password getPassword(Integer id);

	/**
	 * This method will get you all the users
	 * 
	 * @return
	 */
	public List<Password> getPasswords();

	/**
	 * This method will save or update new password to database.
	 * 
	 * @param password
	 */
	public void saveOrUpdatePassword(Password password);

	/**
	 * This method will delete a password
	 * 
	 * @param id
	 */
	public void deletePassword(Integer id);
}
