package com.cg.firsthibernateproject.util;
/*
 * Helper Class to add Hibernate functionality to the application
 * which helps to instantiate Session Factory during application initialization
 */

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

	private static StandardServiceRegistry registry;
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) {
			try {
				//create the registry
				registry = new StandardServiceRegistryBuilder().configure().build();
				//create MetadataSources
				MetadataSources sources = new MetadataSources(registry);
				//create Metadata
				Metadata metadata = sources.getMetadataBuilder().build();
				//create SessionFactory
				sessionFactory = metadata.getSessionFactoryBuilder().build();
			}
			catch(Exception e) {
				e.printStackTrace();
				if(registry != null) {
					StandardServiceRegistryBuilder.destroy(registry);
				}
			}
		}
		return sessionFactory;
	}
}