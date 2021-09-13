package jpa;

import java.util.Date;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/*This class manage an appointement */
@Entity
public class Appointement{
	
	/*Variables*/
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private Date appointementStart;
	private Date appointementEnd;
	private String appointementPlace;
	
	@ManyToOne
	@JoinColumn(name="typeAppointement_id", nullable=false)
	private TypeOfAppointement typeAppointement;
	@ManyToOne
	@JoinColumn(name="customer_id", nullable=false)
	private Customer customer;	
	@ManyToOne
	@JoinColumn(name="worker_id", nullable=false)
	private Worker worker;
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
	
	public Worker getWorker() {
		return worker;
	}

	public void setWorker(Worker worker) {
		this.worker = worker;
	}
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public TypeOfAppointement getTypeAppointement() {
		return typeAppointement;
	}

	public void setTypeAppointement(TypeOfAppointement typeAppointement) {
		this.typeAppointement = typeAppointement;
	}
	

	
	
	
	
	
	
	

	

}
