package com.techiekernel.easylocate.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

import com.techiekernel.easylocate.pojo.Password;

public class PasswordServiceImplTests {
	
	private PasswordService passwordServices;
	
	public PasswordServiceImplTests() {
		passwordServices = Mockito.mock(PasswordService.class);
		Mockito.when(passwordServices.getPassword(1)).thenReturn(new Password());
		Mockito.when(passwordServices.getPasswords()).thenReturn(new ArrayList<Password>());
		Mockito.when(passwordServices.saveOrUpdatePassword(Mockito.any(Password.class))).thenReturn(true);
		Mockito.when(passwordServices.deletePassword(1)).thenReturn(true);
	}

	@Test
	public void testGetPassword() {
		Password geoData = passwordServices.getPassword(1);
		assertNotNull(geoData);
	}

	@Test
	public void testGetPasswords() {
		List<Password> geoDatas = passwordServices.getPasswords();
		assertNotNull(geoDatas);
	}

	@Test
	public void testSaveOrUpdatePassword() {
		assertTrue(passwordServices.saveOrUpdatePassword(new Password()));
	}

	@Test
	public void testDeletePassword() {
		assertTrue(passwordServices.deletePassword(1));
	}

}
