/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qbitserp;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.Transaction;
import qbits.entity.common.Address;
import qbits.entity.common.Employee;
import qbits.entity.common.Person;
import qbits.entity.common.Role;
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

        Role role1 = new Role();
        role1.setTitle("Role 1");

        Role role2 = new Role();
        role2.setTitle("Role 2");


        Employee employee = new Employee();

        Address address = new Address();
        address.setAddress("73-Engulal Road");
        address.setCity("Sylhet");
        address.setDistrict("Sylhet Dist.");
        address.setCountry("Bangladesh");
        
        employee.setFirstName("Employee 01");
        employee.setLastName("Employee last");
        employee.setCreatedBy(1);
        employee.setCreatedDate(new Date());
        
        employee.setAddress(address);
        address.setPerson(employee);
        
        employee.getRoles().add(role1);
        employee.getRoles().add(role2);
        
        
        session.save(employee);

        transaction.commit();
        session.close();

    }
}
