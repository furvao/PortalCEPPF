package br.com.ceppf.business;

import java.util.ArrayList;
import java.util.List;

import br.com.ceppf.model.dao.UserDAO;
import br.com.ceppf.model.entity.User;
import br.com.ceppf.request.UserIn;
import br.com.ceppf.response.UserListOut;
import br.com.ceppf.response.UserOut;

public class UserManager {

	private UserDAO userDAO = new UserDAO();

	public void changeUser(UserIn userIn, boolean insert) {

		User user = new User();
		user.setName(userIn.getName());
		user.setLogin(userIn.getLogin());
		user.setPassword(userIn.getPassword());
		user.setPhone(userIn.getPhone());
		user.setCelphone(userIn.getCelphone());
		user.setTeacher(user.isTeacher());
		if (insert) {

			userDAO.save(user);

		} else {
			user.setId(userIn.getId());

			userDAO.alter(user);
		}

	}

	public void removeUser(Long id) {

		User user = (User) userDAO.findById(id);
		if (user != null) {
			userDAO.delete(user);

		}

	}

	public UserListOut listUser() {

		List<User> users = userDAO.listUsers();

		UserListOut userListOut = new UserListOut();
		for(User u : users){
			userListOut.getUserOuts().add(new UserOut(u));
		}
		
		return userListOut;
	}

}
