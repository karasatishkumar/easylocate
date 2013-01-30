package com.techiekernel.easylocate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.techiekernel.easylocate.dao.UserDAO;
import com.techiekernel.easylocate.pojo.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired(required=true)
	private UserDAO userDAO;

	@Transactional(readOnly = true)
	public User getUser(Integer id) {
		return userDAO.getUser(id);
	}

	@Transactional(readOnly = true)
	public List<User> getUsers() {
		return userDAO.getUsers();
	}

	@Transactional(readOnly = false)
	public boolean saveOrUpdateUser(User user) {
		userDAO.saveOrUpdateUser(user);
		return true;
	}

	@Transactional(readOnly = false)
	public boolean deleteUser(Integer id) {
		userDAO.deleteUser(id);
		return true;
	}

}
