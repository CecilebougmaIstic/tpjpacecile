package doctolibService;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;

import doctolibService.dao.WorkerDao;
import doctolibService.model.Customer;
import doctolibService.model.TypeOfAppointement;
import doctolibService.model.Worker;

public class JpaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		EntityManager manager = EntityManagerHelper.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		*/

			WorkerDao wDao = new WorkerDao();
		Worker workerD = new Worker("Bouda","Marie","boudamarie@fff.com","asdc","mecanisien","12356");
					
			wDao.save(workerD);
					
		try {
				/*
				Worker wok = new Worker("Bouda","Jérôme","boudajerome@fff.com","asdc","mecanisien","12356");
				manager.persist(wok);
				System.out.println(wok.toString());
				TypeOfAppointement repairBicyclette = new TypeOfAppointement("Disponible pour toute réparations sur un vélo", 30, wok);
				manager.persist(repairBicyclette);
				System.out.println(repairBicyclette.toString());
			
				Customer customer = new Customer("Berenie","Machinois","berenicemachinois@yahoo.fr", "ascl", "2CFG521");
				manager.persist(customer);
				//Appointement appointementRepairBicyclette = new Appointement(today(), 2021-10-05, "Place de la république",
					//	repairBicyclette.toString(),customer);
				//System.out.println(appointementRepairBicyclette.toString());
				Worker woker = new Worker("Balime","minet","balimaminet@yahoo.fr","adcvf", "Sécretaire", "12sdd58");
				manager.persist(woker);
				
				*/
				
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/*
		tx.commit();


		manager.close();
		EntityManagerHelper.closeEntityManagerFactory();
		//		factory.close();
		 
		 */
	}


}
