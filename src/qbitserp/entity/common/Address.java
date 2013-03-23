package qbitserp.entity.common;
// Generated 19/03/2013 2:31:28 AM by Hibernate Tools 3.2.1.GA

/**
 * Address generated by hbm2java
 */
public class Address implements java.io.Serializable {

    private int personId;
    private String address;
    private String city;
    private String district;
    private String country;
    private Person person;

    public Address() {
    }

    public Address(int personId, String address, String city, String district, String country) {
        this.personId = personId;
        this.address = address;
        this.city = city;
        this.district = district;
        this.country = country;
    }

    public int getPersonId() {
        return this.personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return this.district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}