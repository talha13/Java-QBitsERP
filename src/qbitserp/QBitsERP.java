/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qbitserp;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.Transaction;
import qbitserp.entity.common.Address;
import qbitserp.entity.common.Employee;
import qbitserp.entity.common.Person;
import qbitserp.entity.common.Role;
import qbitserp.entity.product.Category;
import qbitserp.entity.product.SubCategory;
import qbitserp.entity.smm.Shop;
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

//        Role role1 = new Role();
//        role1.setTitle("Role 1");
//
//        Role role2 = new Role();
//        role2.setTitle("Role 2");
//
//
//        Employee employee = new Employee();
//
//        Address address = new Address();
//        address.setAddress("73-Engulal Road");
//        address.setCity("Sylhet");
//        address.setDistrict("Sylhet Dist.");
//        address.setCountry("Bangladesh");
//        
//        employee.setFirstName("Employee 01");
//        employee.setLastName("Employee last");
//        employee.setCreatedBy(1);
//        employee.setCreatedDate(new Date());
//        
//        employee.setAddress(address);
//        address.setPerson(employee);
//        
//        employee.getRoles().add(role1);
//        employee.getRoles().add(role2);
//        
//        
//        session.save(employee);


////        Person person = new Person("Owner 01", "Last", 1, new Date());
////        Address address = new Address();
////        address.setAddress("73-Engulal Road");
////        address.setCity("Sylhet");
////        address.setDistrict("Sylhet Dist.");
////        address.setCountry("Bangladesh");
////
////        person.setAddress(address);
////        address.setPerson(person);
////        
////        session.save(person);
////
////        Shop shop = new Shop();
//////        shop.setContactPerson(person);
////        shop.setContactPersonId(person.getPersonId());
////        shop.setArea(25.04);
////        shop.setCreatedBy(1);
////        shop.setName("SHop name");
////        shop.setCreatedDate(new Date());
////        shop.setNo(124);
////        shop.setAccountNo("12121212");
////        shop.setDescription("");
////        shop.setMeterNo("1212121212");
//
//        session.save(shop);
        
        Category category = new Category();
        category.setTitle("Electricity Bill 2");
        category.setCreatedBy(1);
        category.setCreatedDate(new Date());
        category.setStatus(true);
        session.save(category);
        
        SubCategory subCategory = new SubCategory();
        subCategory.setTitle("Demand Charge");
        subCategory.setCategory(category);
        subCategory.setCreatedBy(1);
        subCategory.setCreatedDate(new Date());
        category.getSubCategories().add(subCategory);
        
        session.save(category);
        
        
        transaction.commit();
        session.close();

    }
}
