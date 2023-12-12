package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeInsert {
	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setId(5);
		employee.setName("jay");
		employee.setPhone(9876543211l);
		employee.setAddress("nashik");
		employee.setEmail("j@mail");
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("aakansha");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
	}

}
