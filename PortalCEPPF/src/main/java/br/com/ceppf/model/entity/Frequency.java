package br.com.ceppf.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "frequency")
public class Frequency {

	private User user;

	private Lesson lesson;

	@Column(name = "fre_present")
	private boolean present;

	public Frequency() {
		super();
	}

	public Frequency(User user, Lesson lesson, boolean present) {
		super();
		this.user = user;
		this.lesson = lesson;
		this.present = present;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Lesson getLesson() {
		return lesson;
	}

	public void setLesson(Lesson lesson) {
		this.lesson = lesson;
	}

	public boolean isPresent() {
		return present;
	}

	public void setPresent(boolean present) {
		this.present = present;
	}

}
