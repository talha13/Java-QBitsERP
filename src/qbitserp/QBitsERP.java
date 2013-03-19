/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qbitserp;

import entity.common.Address;
import entity.common.Employee;
import entity.common.Person;
import entity.common.UserAuth;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author Topu talha13@gmail.com
 */
public class QBitsERP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here       

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        //one to one
//        Person person = new Person("Mahbubur Rub", "Topu", 1, new Date());
//        
//        Address address = new Address();
//        address.setAddress("73-Engulal Road");
//        address.setCity("Sylhet");
//        address.setDistrict("Sylhet Dist.");
//        address.setCountry("Bangladesh");
//        
//        person.setAddress(address);
//        address.setPerson(person);

        // one to one & inheritance
        Employee employee = new Employee();
        employee.setCreatedDate(new Date());
        employee.setFirstName("Employee First");
        employee.setLastName("Employee Last");
        employee.setDepartment(1);
        employee.setDateOfBirth(new Date());

        Address address = new Address();
        address.setAddress("emp 73-Engulal Road");
        address.setCity("Sylhet");
        address.setDistrict("Sylhet Dist.");
        address.setCountry("Bangladesh");
        
        UserAuth userAuth = new UserAuth();
        userAuth.setUsername("admin");
        userAuth.setPassword("admin");
        userAuth.setLastLogin(new Date());
        userAuth.setStatus(true);
        
        
        address.setPerson(employee);
        employee.setAddress(address);
        employee.setUserAuth(userAuth);
        userAuth.setEmployee(employee);
        
        session.save(employee);




        transaction.commit();
        session.close();

    }
}
