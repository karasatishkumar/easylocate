package com.techiekernel.easylocate.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.techiekernel.easylocate.pojo.User;

public interface UserDAO {

	/**
	 * This method will get to a particular user depending on the id.
	 * 
	 * @param id
	 * @return
	 */
	public User getUser(Integer id);

	/**
	 * This method will get you all the users
	 * 
	 * @return
	 */
	public List<User> getUsers();

	/**
	 * This method will save or update a user to database.
	 * 
	 * @param user
	 */
	public void saveOrUpdateUser(User user);

	/**
	 * This method will delete a user
	 * 
	 * @param id
	 */
	public void deleteUser(Integer id);
}
