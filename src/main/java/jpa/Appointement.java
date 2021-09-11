package jpa;

import java.util.Date;

/*This class manage an appointement */

public class Appointement{
	
	/*Variables*/
	private long id;
	private Date appointementStart;
	private Date appointementEnd;
	private String appointementPlace;
	
	/*Construtors*/	
	public Appointement(long id, Date appointementStart, Date appointementEnd, String appointementPlace) {
		super();
		this.id = id;
		this.appointementStart = appointementStart;
		this.appointementEnd = appointementEnd;
		this.appointementPlace = appointementPlace;
	}

	public Appointement(Date appointementStart, Date appointementEnd, String appointementPlace) {
		super();
		this.appointementStart = appointementStart;
		this.appointementEnd = appointementEnd;
		this.appointementPlace = appointementPlace;
	}

	
	/*Getters && Setters*/
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getAppointementStart() {
		return appointementStart;
	}

	public void setAppointementStart(Date appointementStart) {
		this.appointementStart = appointementStart;
	}

	public Date getAppointementEnd() {
		return appointementEnd;
	}

	public void setAppointementEnd(Date appointementEnd) {
		this.appointementEnd = appointementEnd;
	}

	public String getAppointementPlace() {
		return appointementPlace;
	}

	public void setAppointementPlace(String appointementPlace) {
		this.appointementPlace = appointementPlace;
	}
	

	
	
	
	
	
	
	

	

}
