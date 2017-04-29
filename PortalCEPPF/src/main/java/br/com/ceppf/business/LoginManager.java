package br.com.ceppf.business;

import br.com.ceppf.model.dao.UserDAO;
import br.com.ceppf.model.entity.User;
import br.com.ceppf.request.LoginIn;
import br.com.ceppf.response.LoginOut;

public class LoginManager {

	private UserDAO _userDAO = new UserDAO();

	public LoginOut login(LoginIn loginIn) {

		User user = _userDAO.login(loginIn.getLogin(), loginIn.getPassword());
		LoginOut loginOut = new LoginOut();
		if (user != null) {

			loginOut.setEmail(user.getLogin());
			loginOut.setName(user.getName());
			loginOut.setTeacher(user.isTeacher());
		}

		return loginOut;
	}

}
