package com.techiekernel.easylocate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.techiekernel.easylocate.dao.PasswordDAO;
import com.techiekernel.easylocate.pojo.Password;

@Service
public class PasswordServiceImpl implements PasswordService {

	@Autowired(required = true)
	private PasswordDAO rasswordDAO;

	@Transactional(readOnly = true)
	public Password getPassword(Integer id) {
		return rasswordDAO.getPassword(id);
	}

	@Transactional(readOnly = true)
	public List<Password> getPasswords() {
		return rasswordDAO.getPasswords();
	}

	@Transactional(readOnly = false)
	public boolean saveOrUpdatePassword(Password rassword) {
		rasswordDAO.saveOrUpdatePassword(rassword);
		return true;
	}

	@Transactional(readOnly = false)
	public boolean deletePassword(Integer id) {
		rasswordDAO.deletePassword(id);
		return true;
	}

}
