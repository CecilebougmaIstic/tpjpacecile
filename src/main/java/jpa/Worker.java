package jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Worker extends User{
	
	private long id;
	private String job;
	
	public Worker(long id, String job) {
		super();
		this.id = id;
		this.job = job;
	}

	public Worker(String job) {
		super();
		this.job = job;
	}
	
	@Id
    @GeneratedValue
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
	
	

}
