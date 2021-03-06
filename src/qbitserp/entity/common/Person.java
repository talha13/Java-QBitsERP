package qbitserp.entity.common;
// Generated 19/03/2013 2:31:28 AM by Hibernate Tools 3.2.1.GA

import java.util.Date;

/**
 * Person generated by hbm2java
 */
public class Person implements java.io.Serializable {

    private Integer personId;
    private String firstName;
    private String lastName;
    private String gender;
    private Date dateOfBirth;
    private String contactNo;
    private int createdBy;
    private Date createdDate;
    private Address address;

    public Person() {
    }

    public Person(String firstName, String lastName, int createdBy, Date createdDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
    }

    public Person(String firstName, String lastName, String gender, Date dateOfBirth, String contactNo, int createdBy, Date createdDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.contactNo = contactNo;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
    }

    public Integer getPersonId() {
        return this.personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getContactNo() {
        return this.contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public int getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
