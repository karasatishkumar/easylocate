package com.techiekernel.easylocate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.techiekernel.easylocate.dao.RoleDAO;
import com.techiekernel.easylocate.pojo.Role;

@Service
public class RoleServiceImpl implements RoleService {
	
	@Autowired(required=true)
	private RoleDAO roleDAO;

	@Transactional(readOnly = true)
	public Role getRole(Integer id) {
		return roleDAO.getRole(id);
	}

	@Transactional(readOnly = true)
	public List<Role> getRoles() {
		return roleDAO.getRoles();
	}

	@Transactional(readOnly = false)
	public boolean saveOrUpdateRole(Role role) {
		roleDAO.saveOrUpdateRole(role);
		return true;
	}

	@Transactional(readOnly = false)
	public boolean deleteRole(Integer id) {
		roleDAO.deleteRole(id);
		return true;
	}

}
