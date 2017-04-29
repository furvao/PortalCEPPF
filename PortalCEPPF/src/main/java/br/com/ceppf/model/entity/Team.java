package br.com.ceppf.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lesson")
public class Team {

	@Id
	@Column(name = "tea_id")
	private Long id;

	@Column(name = "tea_name")
	private String name;

	public Team() {
		super();
	}

	public Team(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
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

}
