package com.techiekernel.easylocate.dao;

import java.util.List;

import com.techiekernel.easylocate.pojo.Role;

public interface RoleDAO {
	/**
	 * This method will get to a particular role depending on the id.
	 * 
	 * @param id
	 * @return
	 */
	public Role getRole(Integer id);

	/**
	 * This method will get you all the Role
	 * 
	 * @return
	 */
	public List<Role> getRoles();

	/**
	 * This method will save or update a role to database.
	 * 
	 * @param role
	 */
	public void saveOrUpdateRole(Role role);

	/**
	 * This method will delete a role
	 * 
	 * @param id
	 */
	public void deleteRole(Integer id);
}
