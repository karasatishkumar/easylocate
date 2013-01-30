package com.techiekernel.easylocate.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.techiekernel.easylocate.pojo.Password;

@Repository
public class PasswordDAOImpl implements PasswordDAO {

	@Autowired(required=true)
	private SessionFactory sessionFactory;

	public Password getPassword(Integer id) {
		return (Password) sessionFactory.getCurrentSession().get(
				Password.class, id);
	}

	public List<Password> getPasswords() {
		return sessionFactory.getCurrentSession().createQuery("from Password")
				.list();
	}

	public void saveOrUpdatePassword(Password password) {
		sessionFactory.getCurrentSession().saveOrUpdate(password);
	}

	public void deletePassword(Integer id) {
		Password password = (Password) sessionFactory.getCurrentSession().load(
				Password.class, id);
		if (null != password) {
			sessionFactory.getCurrentSession().delete(password);
		}

	}

}
