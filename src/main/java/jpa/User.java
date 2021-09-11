package jpa;

/*This class manage a User*/

/*An objet, type Enum for 2 types of a user*/
enum TypeUser{
	WORKER, CUSTOMER
}

public abstract class User {
	
	/*Variables*/	
	private long id;
	private String namefirstName;
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
		this.namefirstName = namefirstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}
	public User(String namefirstName, String lastName, String email, String password) {
		super();
		this.namefirstName = namefirstName;
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
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNamefirstName() {
		return namefirstName;
	}
	public void setNamefirstName(String namefirstName) {
		this.namefirstName = namefirstName;
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
