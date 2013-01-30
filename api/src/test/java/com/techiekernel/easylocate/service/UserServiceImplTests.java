package com.techiekernel.easylocate.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

import com.techiekernel.easylocate.pojo.User;

public class UserServiceImplTests {
	
	private UserService userServices;
	
	public UserServiceImplTests() {
		userServices = Mockito.mock(UserService.class);
		Mockito.when(userServices.getUser(1)).thenReturn(new User());
		Mockito.when(userServices.getUsers()).thenReturn(new ArrayList<User>());
		Mockito.when(userServices.saveOrUpdateUser(Mockito.any(User.class))).thenReturn(true);
		Mockito.when(userServices.deleteUser(1)).thenReturn(true);
	}

	@Test
	public void testGetUser() {
		User geoData = userServices.getUser(1);
		assertNotNull(geoData);
	}

	@Test
	public void testGetUsers() {
		List<User> geoDatas = userServices.getUsers();
		assertNotNull(geoDatas);
	}

	@Test
	public void testSaveOrUpdateUser() {
		assertTrue(userServices.saveOrUpdateUser(new User()));
	}

	@Test
	public void testDeleteUser() {
		assertTrue(userServices.deleteUser(1));
	}

}
