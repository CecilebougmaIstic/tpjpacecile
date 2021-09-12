package jpa;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/*This class create a customer*/
@Entity

@DiscriminatorValue("C")
public class Customer extends User{
	
	/*variables*/
	private long id;
	private String bankCard;
	@ManyToOne
	@JoinColumn(name="id", nullable=false)
	private Appointement appointement;
	
	/*Constructor*/

	public Customer(long id, String bankCard) {
		super();
		this.id = id;
		this.bankCard = bankCard;
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
	public String getBankCard() {
		return bankCard;
	}
	public void setBankCard(String bankCard) {
		this.bankCard = bankCard;
	}
	
	
	

}
