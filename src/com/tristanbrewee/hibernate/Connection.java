package com.tristanbrewee.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Connection {

    /*
    This method gets Hibernate started
     */
    public static void initialize(){
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources( ssr ).getMetadataBuilder().build();

        SessionFactory factory = metadata.getSessionFactoryBuilder().build();

        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();
    }
}
