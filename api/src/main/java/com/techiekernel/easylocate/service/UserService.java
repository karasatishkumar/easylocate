package com.techiekernel.easylocate.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.techiekernel.easylocate.pojo.User;

@Component
public interface UserService {
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
	public boolean saveOrUpdateUser(User user);

	/**
	 * This method will delete a user
	 * 
	 * @param id
	 */
	public boolean deleteUser(Integer id);
}
