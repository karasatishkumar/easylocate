package com.techiekernel.easylocate.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.techiekernel.easylocate.pojo.Role;

@Repository
public class RoleDAOImpl implements RoleDAO {

	@Autowired(required=true)
	private SessionFactory sessionFactory;

	public Role getRole(Integer id) {
		return (Role) sessionFactory.getCurrentSession().get(Role.class, id);
	}

	public List<Role> getRoles() {
		return sessionFactory.getCurrentSession().createQuery("from Role")
				.list();
	}

	public void saveOrUpdateRole(Role role) {
		sessionFactory.getCurrentSession().saveOrUpdate(role);
	}

	public void deleteRole(Integer id) {
		Role role = (Role) sessionFactory.getCurrentSession().load(Role.class,
				id);
		if (null != role) {
			sessionFactory.getCurrentSession().delete(role);
		}
	}

}
