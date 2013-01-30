package com.techiekernel.easylocate.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.techiekernel.easylocate.pojo.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired(required = true)
	private SessionFactory sessionFactory;

	public User getUser(Integer id) {
		return (User) sessionFactory.getCurrentSession().get(User.class, id);
	}

	public List<User> getUsers() {
		return sessionFactory.getCurrentSession().createQuery("from User")
				.list();
	}

	public void saveOrUpdateUser(User user) {
		user.setUserLastUpdated(new Date());
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	}

	public void deleteUser(Integer id) {
		User user = (User) sessionFactory.getCurrentSession().load(User.class,
				id);
		if (null != user) {
			sessionFactory.getCurrentSession().delete(user);
		}
	}

}
