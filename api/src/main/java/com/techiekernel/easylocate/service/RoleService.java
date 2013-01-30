package com.techiekernel.easylocate.service;

import java.util.List;

import com.techiekernel.easylocate.pojo.Role;

public interface RoleService {
	/**
	 * This method will get to a particular role depending on the id.
	 * 
	 * @param id
	 * @return
	 */
	public Role getRole(Integer id);

	/**
	 * This method will get you all the roles
	 * 
	 * @return
	 */
	public List<Role> getRoles();

	/**
	 * This method will save or update a role to database.
	 * 
	 * @param role
	 */
	public boolean saveOrUpdateRole(Role role);

	/**
	 * This method will delete a role
	 * 
	 * @param id
	 */
	public boolean deleteRole(Integer id);
}
