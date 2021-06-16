package com.cg.firsthibernateproject;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
 
import com.cg.firsthibernateproject.entity.Employee;
import com.cg.firsthibernateproject.util.HibernateUtil;
 
public class App 
{
    public static void main( String[] args )
    {
        Employee emp = new Employee("Kenny@gmail.com", "Kenny", "Evans");
        Employee emp1 = new Employee("danny@gmail.com", "Danny", "Smith");
        Transaction transaction = null;
        try {
        	Session session = HibernateUtil.getSessionFactory().openSession();
        	//start a transaction
        	transaction = session.beginTransaction();
        	//save the employee objects in to table
        	session.save(emp);
        	session.save(emp1);
        	//commit transaction
        	transaction.commit();	
        }catch(Exception e) {
        	if(transaction != null) {
        		transaction.rollback();
        	}
        	e.printStackTrace();
        }//catch close
        
      //read data from table Employee using Hibernate  
        try {
        	Session session = HibernateUtil.getSessionFactory().openSession();
        	List<Employee> employees = session.createQuery("from Employee",Employee.class).list();
        	employees.forEach(em -> System.out.println(em.getEmail()));
        
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}