package jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/*with this class a professionnal can manage a type of an appointement
 * describe and duration of an appointement
 *
 */
@Entity
public class TypeOfAppointement {
	
	/*Variables*/
	private long id;
	private String appointementDescription;
	private int appointementLimit;
	
	@OneToMany
    @JoinColumn(name="id", nullable=false)
	private Appointement appointment;
	@OneToOne
	@JoinColumn(name="id", nullable=false)
	private Worker worker;
	@OneToOne
	@JoinColumn(name="id", nullable=false)
	private Customer customer;
	
	
	/*Constructors*/
	public TypeOfAppointement(long id, String appointementDescription, int appointementLimit) {
		super();
		this.id = id;
		this.appointementDescription = appointementDescription;
		this.appointementLimit = appointementLimit;
	}

	public TypeOfAppointement(String appointementDescription, int appointementLimit) {
		super();
		this.appointementDescription = appointementDescription;
		this.appointementLimit = appointementLimit;
	}

	/*Getters && setters*/

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
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

	public int getAppointementLimit() {
		return appointementLimit;
	}

	public void setAppointementLimit(int appointementLimit) {
		this.appointementLimit = appointementLimit;
	}
	
	
	
	
	
	
}
