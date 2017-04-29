package br.com.ceppf.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@Column(name = "usu_id")
	private Long id;

	@Column(name = "usu_name")
	private String name;

	@Column(name = "usu_login")
	private String login;

	@Column(name = "usu_password")
	private String password;

	@Column(name = "usu_phone")
	private String phone;

	@Column(name = "usu_celphone")
	private String celphone;

	@Column(name = "usu_teacher")
	private boolean teacher;

//	private Team team;

	public User() {
		super();
	}

	public User(Long id, String name, String login, String password, String phone, String celphone, boolean teacher) {
		super();
		this.id = id;
		this.name = name;
		this.login = login;
		this.password = password;
		this.phone = phone;
		this.celphone = celphone;
		this.teacher = teacher;
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

//	public Team getTeam() {
//		return team;
//	}
//
//	public void setTeam(Team team) {
//		this.team = team;
//	}

}
