package jpa;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity

@DiscriminatorValue("W")
public class Worker extends User{
	
	/*Variables*/
	private long id;
	private String job;
	private String bakRib;
	/*111111mapping relatation*/
	/*One Worker can have many apointement*/
	@OneToMany
	@JoinColumn(name="id", nullable=false)
	private Appointement app;
	
/*Constructor*/
	public Worker(long id, String job, String bakRib) {
		super();
		this.id = id;
		this.job = job;
		this.bakRib = bakRib;
	}


	public Worker(String job, String bakRib) {
		super();
		this.job = job;
		this.bakRib = bakRib;
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
	
	
	
	
	
	
	

}
