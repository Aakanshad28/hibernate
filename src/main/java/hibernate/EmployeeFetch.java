package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeFetch {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("aakansha");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Employee employee=entityManager.find(Employee.class, 100);
	
		if (employee!=null) {
			System.out.println(employee);
		}else {
			System.out.println("Employee with the given id not found!");
		}
		
	}

}
