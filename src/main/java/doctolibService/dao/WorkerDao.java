package doctolibService.dao;


import java.util.List;

import doctolibService.model.Worker;

public class WorkerDao extends AbstractJpaDao <Long,Worker>{

	public WorkerDao() {
		super(Worker.class);
		// TODO Auto-generated constructor stub
	}
	
	/*Get a list*/
  public List < Worker>getAllTypeOfAppointementsForAWorker(){
	 String query ="select distinct K.typeAppointements from TypeOfAppointement as k";
	 return this.entityManager.createQuery(query).getResultList();
	}
	
}
