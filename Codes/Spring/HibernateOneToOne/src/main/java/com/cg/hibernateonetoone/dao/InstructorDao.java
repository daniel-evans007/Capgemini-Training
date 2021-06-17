package com.cg.hibernateonetoone.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.cg.hibernateonetoone.entity.Instructor;
import com.cg.hibernateonetoone.util.HibernateUtil;

public class InstructorDao {

	public void saveInstructor(Instructor instructor) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			//start transaction
			transaction = session.beginTransaction();
			//save the Instructor object
			session.save(instructor);
			//commit the transaction
			transaction.commit();
		}
		catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
	
	public void updateInstructor(Instructor instructor) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			//start transaction
			transaction =  session.beginTransaction();
			//save the instructor object
			session.saveOrUpdate(instructor);
			//commit the transaction
			transaction.commit();
		}
		catch (Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
	
	public Instructor deleteInstructor(int id) {
		Transaction transaction = null;
		Instructor instructor = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			//start transaction
			transaction = session.beginTransaction();
			//get instructor using id
			instructor = session.get(Instructor.class, id);
			//save the Instructor object
			
			session.delete(instructor);
			//commit the transaction
			transaction.commit();
		}
		catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return instructor;
	}
	
	public Instructor getInstructor(int id) {
		Transaction transaction = null;
		Instructor instructor = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			//start transaction
			transaction = session.beginTransaction();
			//get instructor using id
			instructor = session.get(Instructor.class, id);
			//commit the transaction
			transaction.commit();
		}
		catch (Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return instructor;
	}
	
	public List<Instructor> getAllInstructors() {
		List<Instructor> instructors = null;
		//read data from table instructor using hibernate
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			instructors = session.createQuery("from Instructor", Instructor.class).list();
			instructors.forEach(ins -> System.out.println(ins.getEmail()));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return instructors;
	}
}