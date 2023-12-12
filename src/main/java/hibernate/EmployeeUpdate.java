package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeUpdate {
	public static void main(String[] args) {
//		Employee employee=new Employee();
//		employee.setId(2);
//		employee.setName("shital");
//		employee.setPhone(76543218900l);
//		employee.setAddress("ahmednagar");
//		employee.setEmail("@gmail");
//		
//		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("aakansha");
//		EntityManager entityManager=entityManagerFactory.createEntityManager();
//		EntityTransaction entityTransaction=entityManager.getTransaction();
//
//		Employee dbEmployee= entityManager.find(Employee.class, employee.getId());
//		if (dbEmployee != null) {
//			employee.setAddress("pune");
//			entityTransaction.begin();
//			entityManager.merge(dbEmployee);
//			entityTransaction.commit();
//		} else {
//			System.out.println("Employee with given id is not found");
//
//		}
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("aakansha");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Employee employee=new Employee();
		Employee dbEmployee= entityManager.find(Employee.class, 2);
		if (dbEmployee != null) {
			employee.setAddress("pune");
			entityTransaction.begin();
			entityManager.merge(dbEmployee);
			entityTransaction.commit();
		} else {
			System.out.println("Employee with given id is not found");

		}
	}

}
