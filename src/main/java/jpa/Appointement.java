package jpa;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Appointement{
	private long id;
	private Date dateRdv;
	private String description;
	
	
	public Appointement() {}
	
	public Appointement(long id, Date date, String description) {
		this.id=id;
		this.dateRdv = date;
		this.description = description;
		
	}
	public Appointement (Date date, String description) {
		this.dateRdv = date;
		this.description = description;
		
	}
	@Id
    @GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDateRdv() {
		return dateRdv;
	}

	public void setDateRdv(Date dateRdv) {
		this.dateRdv = dateRdv;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
