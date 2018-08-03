package com.hiber;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

			private static SessionFactory factory; 
			   public static void main(String[] args) {
			      
			      try {
			         factory = new Configuration().configure().buildSessionFactory();
			      } catch (Throwable ex) { 
			         System.err.println("Failed to create sessionFactory object." + ex);
			         throw new ExceptionInInitializerError(ex); 
			      }
			      
			      MainApp ME = new MainApp();

			      /* Add few employee records in database */
			      Integer empID1 = ME.addEmployee("Zara", "Ali", 1000, "Ahmedabad", "20180516");

			      /* List down all the employees */
			      //ME.listEmployees();

			      /* Update employee's records */
			      //ME.updateEmployee(empID1, 5000);

			      /* Delete an employee from the database */
			      //ME.deleteEmployee(empID2);

			      /* List down new list of the employees */
			      //ME.listEmployees();
			   }
			   
			   
	public Integer addEmployee(String name, String surname, int i, String add, String joinDate) {
		Session session = factory.openSession();
		Transaction tx = null;
		Integer employeeID = null;

		try {
			tx = session.beginTransaction();
			Users employee = new Users(name, surname, i, add, joinDate);
			employeeID = (Integer) session.save(employee);
			System.out.println("addEmployee_employeeID: " + employeeID);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return employeeID;
	}
				
			
}
