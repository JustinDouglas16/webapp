package com.webapp.project.app.services.impl;

import java.time.LocalDateTime;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.project.app.repositories.LoginRepository;
import com.webapp.project.app.repositories.entities.Login;
import com.webapp.project.app.services.LoginService;
import com.webapp.project.app.valueObjects.LoginVO;

@Service
@Transactional
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginRepository loginRepository;
	
	@Override
	public Login persistLogin(LoginVO vo) {
		Login login = new Login();
		login.setEmail(vo.getEmail());
		login.setPassword(vo.getPassword());
		login.setLogindatetime(LocalDateTime.now());
		return loginRepository.save(login);
	}

	
}
