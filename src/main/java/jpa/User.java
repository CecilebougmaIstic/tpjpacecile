package jpa;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/*This class manage a User*/
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="User_type")
public abstract class User {
	
	/*Variables*/	
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	
	
	/*Constructors*/
	public User() {
		super();
		
	}
	public User(long id, String namefirstName, String lastName, String email, String password) {
		super();
		this.id = id;
		this.firstName = namefirstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}
	public User(String namefirstName, String lastName, String email, String password) {
		super();
		this.firstName = namefirstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}
	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	
	/*Getters && Setters*/	

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String namefirstName) {
		this.firstName = namefirstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

	
}
