package jpa;

/*This class create a customer*/

public class Customer extends User{
	
	/*variables*/
	private long id;
	private String bankCard;
	
	/*Constructor*/

	public Customer(long id, String bankCard) {
		super();
		this.id = id;
		this.bankCard = bankCard;
	}
	
	
	/*Getters && Setters*/
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
