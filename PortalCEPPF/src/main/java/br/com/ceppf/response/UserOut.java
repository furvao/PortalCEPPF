package br.com.ceppf.response;

import javax.persistence.Column;

import br.com.ceppf.model.entity.User;

public class UserOut {

	private Long id;

	private String name;

	private String login;

	private String password;

	private String phone;

	private String celphone;

	private boolean teacher;

	public UserOut() {
		super();
	}
	

	public UserOut(User user) {
		super();
		this.id = user.getId();
		this.name = user.getName();
		this.login = user.getLogin();
		this.password = user.getPassword();
		this.phone = user.getPhone();
		this.celphone = user.getCelphone();
		this.teacher = user.isTeacher();
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCelphone() {
		return celphone;
	}

	public void setCelphone(String celphone) {
		this.celphone = celphone;
	}

	public boolean isTeacher() {
		return teacher;
	}

	public void setTeacher(boolean teacher) {
		this.teacher = teacher;
	}
	
	

}
