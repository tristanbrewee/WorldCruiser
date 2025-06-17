package hibernate;

import model.City;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.List;

public class Connection {

    private static SessionFactory  sessionFactory = null;
    /*
    This method gets Hibernate started
     */
    public static void initialize(){
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources( ssr ).getMetadataBuilder().build();

        try{
            sessionFactory = metadata.buildSessionFactory();
        } catch (Exception e){
            System.out.println("Error in initializing sessionFactory");
            System.out.printf(e.getMessage());
        }
    }

    /*
    This method Saves a given city to the database
     */
    public static void addCity(String cityName, String countryCode, String district, int population) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            City city = new City(cityName, countryCode, district, population);
            int cityId = (int) session.save(city);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            System.out.printf(e.getMessage());
        } finally {
            session.close();
        }
    }

    /*
    This method prints all cities in the database
     */
    public static void listCity() {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            List cities = session.createQuery("from City").list();
            for (Object city : cities) {
                City c = (City) city;
                System.out.print(c.getName() + "\t");
                System.out.print(c.getCountryCode() + "\t");
                System.out.print(c.getDistrict() + "\t");
                System.out.print(c.getPopulation() + "\n");
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            System.out.printf(e.getMessage());
        } finally {
            session.close();
        }
    }


}
