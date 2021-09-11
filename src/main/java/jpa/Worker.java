package jpa;

public class Worker extends User{
	
	/*Variables*/
	private long id;
	private String job;
	private String bakRib;
	
	
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
