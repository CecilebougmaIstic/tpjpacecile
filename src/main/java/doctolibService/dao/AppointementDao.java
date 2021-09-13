package doctolibService.dao;

import doctolibService.model.Appointement;

public class AppointementDao extends AbstractJpaDao <Long,Appointement> {

	public AppointementDao() {
		super(Appointement.class);
		
	}

}
