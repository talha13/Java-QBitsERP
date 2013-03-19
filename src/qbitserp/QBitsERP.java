/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qbitserp;

import entity.common.Address;
import entity.common.Person;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author Topu
 * talha13@gmail.com
 */
public class QBitsERP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here       

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Person person = new Person("Mahbubur Rub", "Topu", 1, new Date());
        
        Address address = new Address();
        address.setAddress("73-Engulal Road");
        address.setCity("Sylhet");
        address.setDistrict("Sylhet Dist.");
        address.setCountry("Bangladesh");
        
        person.setAddress(address);
        address.setPerson(person);

//        session.save(person);
        session.persist(person);

        transaction.commit();
        session.close();

    }
}
