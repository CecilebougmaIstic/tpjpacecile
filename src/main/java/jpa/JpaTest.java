package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;

public class JpaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		EntityManager manager = EntityManagerHelper.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();


		try {
				Worker wok = new Worker("Bouda","Jérôme","boudajerome@fff.com","asdc","mecanisien","12356");
				manager.persist(wok);
				System.out.println(wok.toString());
				Customer customer = new Customer("Berenie","Machinois","berenicemachinois@yahoo.fr", "ascl", "2CFG521");
				manager.persist(customer);
				TypeOfAppointement reparerUnVelo = new TypeOfAppointement("Disponible pour toute réparations sur un vélo", 30, wok);
				manager.persist(reparerUnVelo);
				System.out.println(reparerUnVelo.toString());
				Worker woker = new Worker("Balime","minet","balimaminet@yahoo.fr","adcvf", "Sécretaire", "12sdd58");
				manager.persist(woker);
				
				
				
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();


		manager.close();
		EntityManagerHelper.closeEntityManagerFactory();
		//		factory.close();
	}


}
