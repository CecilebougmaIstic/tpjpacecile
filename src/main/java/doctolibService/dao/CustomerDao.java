package doctolibService.dao;

import doctolibService.model.Customer;

public class CustomerDao extends AbstractJpaDao <Long,Customer>{

	public CustomerDao() {
		super(Customer.class);
		
	}

}
