package com.webapp.project.app.services;

import com.webapp.project.app.repositories.entities.Login;
import com.webapp.project.app.valueObjects.LoginVO;

public interface LoginService {

	public Login persistLogin(LoginVO vo);
}
