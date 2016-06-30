package com.simcity123client.simcity123;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {    
	 
	 final static Logger logger = Logger.getLogger(HibernateUtil.class);
	 
	 private static SessionFactory sessionFactory;
	 
	 public static SessionFactory getSessionFactory() {
			if (sessionFactory == null) {
				Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
				StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
				serviceRegistryBuilder.applySettings(configuration.getProperties());
				ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
				sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			}

			return sessionFactory;
	}
 }