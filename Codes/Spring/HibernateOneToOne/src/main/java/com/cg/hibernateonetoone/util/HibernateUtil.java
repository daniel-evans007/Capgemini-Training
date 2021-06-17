package com.cg.hibernateonetoone.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.cg.hibernateonetoone.entity.Course;
import com.cg.hibernateonetoone.entity.Instructor;
import com.cg.hibernateonetoone.entity.InstructorDetail;
import com.cg.hibernateonetoone.entity.Project;


/*
 * Java Config file that contains
 * information about the database
 * instead of using hibernate.cfg.xml file
 */

public class HibernateUtil {

	/*
	 * Session Factory is used to create
	 * database session to the DB session
	 * using the Hibernate framework
	 */
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() throws Exception {
		if (sessionFactory == null) {
			/*
			 * An instance/object of Configuration
			 * allows the application to specify
			 * properties and mappings used
			 * when creating a session using SessionFactory
			 */
			Configuration cfg = new Configuration();
			
			/*
			 * This class contains key, value pairs,
			 * both are strings
			 * it is a subclass of HashTable
			 * can be used to represent persistent set of properties
			 */
			Properties dbsettings = new Properties();
			dbsettings.put(Environment.DRIVER, "oracle.jdbc.driver.OracleDriver");
			dbsettings.put(Environment.URL, "jdbc:oracle:thin:@localhost:1521:xe");
			dbsettings.put(Environment.USER, "system");
			dbsettings.put(Environment.PASS, "oracle");
			dbsettings.put(Environment.DIALECT, "org.hibernate.dialect.Oracle10gDialect");
			dbsettings.put(Environment.SHOW_SQL, "true");
			dbsettings.put(Environment.HBM2DDL_AUTO, "create-drop");
			dbsettings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
			
			cfg.setProperties(dbsettings);
			cfg.addAnnotatedClass(Instructor.class);
			cfg.addAnnotatedClass(InstructorDetail.class);
			cfg.addAnnotatedClass(Course.class);
			cfg.addAnnotatedClass(Project.class);
			
			/*
			 * this contains contracts that make up the hibernate
			 * bootstrapping API to register the application
			 * with hibernate
			 */
			ServiceRegistry srvReg = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
			System.out.println("Hibernate Java Config Service Registry Created");
			
			sessionFactory = cfg.buildSessionFactory(srvReg);
		}
		return sessionFactory;
	}
}