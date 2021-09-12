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
	/*Mapping relation*/
	@ManyToOne
	@JoinColumn(name="id", nullable=false)
	private Appointement appointement;
	
	/*Constructor*/

	public Customer(long id, String firstName, String lastName, String email, String password,String bankCard) {
		super();
		this.id = id;
		this.firstName=firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.bankCard = bankCard;
	}
	
	public Customer(String firstName, String lastName, String email, String password,String bankCard) {
		super();
		this.firstName=firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
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
