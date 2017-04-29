package br.com.ceppf.model.dao;

import java.util.List;

import org.hibernate.query.Query;

import br.com.ceppf.model.dao.util.AbstractDAO;
import br.com.ceppf.model.entity.User;

public class UserDAO extends AbstractDAO<User> {
	
	public User login(String login, String password){
		
		Query query = getSession().createQuery("from User where lower(login) = lower(:login) and password = :password");
		query.setString("login", login);
		query.setString("password", password);
		
		User user = (User) query.uniqueResult();
		
		return user;
	
	}
	

	public List<User> listUsers() {

		Query query = getSession().createQuery("from User where teacher = 0");

		return query.list();

	}
	
	public List<User> listTeachers() {

		Query query = getSession().createQuery("from User where teacher = 1");

		return query.list();

	}

}
