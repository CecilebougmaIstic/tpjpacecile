package jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;

@Entity

@Inheritance(strategy=InheritanceType.JOINED)


public class User {
	
	private long id;
	private String name;
	private String email;
	
	public User () {}
	
	public User(long id, String name, String email) {
		this.id =id;
		this.name=name;
		this.email = email;
	}
	public User (String name, String email) {
		this.name=name;
		this.email =email;
	}
	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}