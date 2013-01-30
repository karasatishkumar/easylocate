package com.techiekernel.easylocate.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

import com.techiekernel.easylocate.pojo.Role;

public class RoleServiceImplTests {
	
	private RoleService roleServices;
	
	public RoleServiceImplTests() {
		roleServices = Mockito.mock(RoleService.class);
		Mockito.when(roleServices.getRole(1)).thenReturn(new Role());
		Mockito.when(roleServices.getRoles()).thenReturn(new ArrayList<Role>());
		Mockito.when(roleServices.saveOrUpdateRole(Mockito.any(Role.class))).thenReturn(true);
		Mockito.when(roleServices.deleteRole(1)).thenReturn(true);
	}

	@Test
	public void testGetRole() {
		Role geoData = roleServices.getRole(1);
		assertNotNull(geoData);
	}

	@Test
	public void testGetRoles() {
		List<Role> geoDatas = roleServices.getRoles();
		assertNotNull(geoDatas);
	}

	@Test
	public void testSaveOrUpdateRole() {
		assertTrue(roleServices.saveOrUpdateRole(new Role()));
	}

	@Test
	public void testDeleteRole() {
		assertTrue(roleServices.deleteRole(1));
	}

}
