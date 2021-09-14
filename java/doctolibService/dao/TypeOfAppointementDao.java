package doctolibService.dao;

import java.io.Serializable;

import doctolibService.model.TypeOfAppointement;

public class TypeOfAppointementDao extends AbstractJpaDao <Long,TypeOfAppointement> {

	public TypeOfAppointementDao() {
		super(TypeOfAppointement.class);
		
	}
	

}
