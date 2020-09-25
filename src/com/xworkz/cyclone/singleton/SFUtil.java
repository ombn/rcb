package com.xworkz.cyclone.singleton;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * 
 * @author Om Gives ref of one Session Factory
 */
public class SFUtil {

	private  static SessionFactory factory;

	public static SessionFactory getFactory() {
		System.out.println("SF is only readble from outside class");
		return factory;
	}

	public static void closeFactory() {
		System.out.println("closing Session Factory");
		if (factory != null && !factory.isClosed()) {
			factory.close();
			System.out.println("closed factory");
		} else {
			System.out.println("factory might be already closed");
		}

	}

	static {
		System.out.println("initalzing SF in static block");
		System.out.println("Creating cfg and init SF ");
		try {
			Configuration configuration = new Configuration();
			configuration.configure("mysql.xml");
			System.out.println("adding entity classes should be improved!!!");
			factory = configuration.buildSessionFactory();
			System.out.println("init SF complete");
		} catch (Exception e) {
			System.err.println("Excception creating SF , in static block"+e.getMessage());			
		}

	}

}
