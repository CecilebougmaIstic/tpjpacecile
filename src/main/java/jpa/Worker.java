package jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity

@DiscriminatorValue("W")
public class Worker extends User{
	
	/*Variables*/
	private long id;
	private String job;
	private String bakRib;
	private List<TypeOfAppointement> typeApp = new ArrayList<TypeOfAppointement>();
	private List<Appointement> app = new ArrayList<Appointement>();
	
	
	
	
	
	
	

	/*Constructor*/
	public Worker(long id, String job, String bakRib) {
		super();
		this.id = id;
		this.job = job;
		this.bakRib = bakRib;
		
	}


	public Worker(String firstName, String lastName, String email, String password,String job, String bakRib) {
		super();
		this.job = job;
		this.bakRib = bakRib;
		this.firstName=firstName;
		this.lastName = lastName;
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


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	public String getBakRib() {
		return bakRib;
	}


	public void setBakRib(String bakRib) {
		this.bakRib = bakRib;
	}
	
	
	
	@OneToMany(mappedBy = "TypeOfAppointement", cascade = CascadeType.PERSIST)
	public List<TypeOfAppointement> getTypeApp() {
			return typeApp;
		}


		public void setTypeApp(List<TypeOfAppointement> typeApp) {
			this.typeApp = typeApp;
		}

		@OneToMany(mappedBy = "Appointement", cascade = CascadeType.PERSIST)
		public List<Appointement> getApp() {
			return app;
		}


		public void setApp(List<Appointement> app) {
			this.app = app;
		}

	
	
	
	

}
