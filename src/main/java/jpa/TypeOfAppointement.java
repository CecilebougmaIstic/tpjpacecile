package jpa;

/*with this class a professionnal can manage a type of an appointement
 * describe and duration of an appointement
 *
 */

public class TypeOfAppointement {
	
	/*Variables*/
	private long id;
	private String appointementDescription;
	private long appointementLimit;
	
	/*Constructors*/
	public TypeOfAppointement(long id, String appointementDescription, long appointementLimit) {
		super();
		this.id = id;
		this.appointementDescription = appointementDescription;
		this.appointementLimit = appointementLimit;
	}

	public TypeOfAppointement(String appointementDescription, long appointementLimit) {
		super();
		this.appointementDescription = appointementDescription;
		this.appointementLimit = appointementLimit;
	}

	/*Getters && setters*/
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAppointementDescription() {
		return appointementDescription;
	}

	public void setAppointementDescription(String appointementDescription) {
		this.appointementDescription = appointementDescription;
	}

	public long getAppointementLimit() {
		return appointementLimit;
	}

	public void setAppointementLimit(long appointementLimit) {
		this.appointementLimit = appointementLimit;
	}
	
	
	
	
	
	
}
