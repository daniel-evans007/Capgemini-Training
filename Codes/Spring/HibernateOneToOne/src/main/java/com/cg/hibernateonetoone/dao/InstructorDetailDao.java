package com.cg.hibernateonetoone.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.cg.hibernateonetoone.entity.Instructor;
import com.cg.hibernateonetoone.entity.InstructorDetail;
import com.cg.hibernateonetoone.util.HibernateUtil;

public class InstructorDetailDao {

	public void saveInstructorDetail(InstructorDetail instructorDetail) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			//start transaction
			transaction = session.beginTransaction();
			//save the InstructorDetail object
			session.save(instructorDetail);
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
	
	public InstructorDetail deleteInstructorDetail(int id) {
		Transaction transaction = null;
		InstructorDetail instructorDetail = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			//start transaction
			transaction = session.beginTransaction();
			
			instructorDetail = session.get(InstructorDetail.class, id);
			//save the Instructor object
			session.delete(instructorDetail);
			//commit the transaction
			transaction.commit();
		}
		catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return instructorDetail;
	}
}