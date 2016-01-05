package com.chn.HiberPro;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import models.Address;
import models.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Address address = new Address();
       address.setStreetName("asd");
       address.setCity("ist");
       Person person = new Person();
       person.setName("chn");
       person.setAge(25);
       person.getAddresses().add(address);
       SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
       Session session = factory.openSession();
       session.beginTransaction();
       session.save(person);
       session.getTransaction().commit();
       session.flush();
       session.close();
       
       
    }
}
