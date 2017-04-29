package br.com.ceppf.request;

public class UserIn {

	private Long id;

	private String login;
	private String name;
	private String password;
	private String phone;
	private String celphone;
	private boolean teacher;

	public UserIn() {
		super();
	}

	public UserIn(String login, String name, String password, String phone, String celphone, boolean teacher) {
		super();
		this.login = login;
		this.name = name;
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
