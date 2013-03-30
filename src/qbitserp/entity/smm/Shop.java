/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qbitserp.entity.smm;

import java.util.Date;
import qbitserp.entity.common.Person;

/**
 *
 * @author Topu
 */
public class Shop {

    private Integer shopId;
    private Person contactPerson;
    private String name;
    private Integer no;
    private Double area;
    private String meterNo;
    private String accountNo;
    private String description;
    private Integer createdBy;
    private Date createdDate;
    private Integer contactPersonId;

    /**
     * Get the value of contactPersonId
     *
     * @return the value of contactPersonId
     */
    public Integer getContactPersonId() {
        return contactPersonId;
    }

    /**
     * Set the value of contactPersonId
     *
     * @param contactPersonId new value of contactPersonId
     */
    public void setContactPersonId(Integer contactPersonId) {
        this.contactPersonId = contactPersonId;
    }

    /**
     * Get the value of createdDate
     *
     * @return the value of createdDate
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * Set the value of createdDate
     *
     * @param createdDate new value of createdDate
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * Get the value of createdBy
     *
     * @return the value of createdBy
     */
    public Integer getCreatedBy() {
        return createdBy;
    }

    /**
     * Set the value of createdBy
     *
     * @param createdBy new value of createdBy
     */
    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * Get the value of description
     *
     * @return the value of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the value of description
     *
     * @param description new value of description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get the value of accountNo
     *
     * @return the value of accountNo
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * Set the value of accountNo
     *
     * @param accountNo new value of accountNo
     */
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    /**
     * Get the value of meterNo
     *
     * @return the value of meterNo
     */
    public String getMeterNo() {
        return meterNo;
    }

    /**
     * Set the value of meterNo
     *
     * @param meterNo new value of meterNo
     */
    public void setMeterNo(String meterNo) {
        this.meterNo = meterNo;
    }

    /**
     * Get the value of area
     *
     * @return the value of area
     */
    public Double getArea() {
        return area;
    }

    /**
     * Set the value of area
     *
     * @param area new value of area
     */
    public void setArea(Double area) {
        this.area = area;
    }

    /**
     * Get the value of shopNo
     *
     * @return the value of shopNo
     */
    public Integer getNo() {
        return no;
    }

    /**
     * Set the value of shopNo
     *
     * @param shopNo new value of shopNo
     */
    public void setNo(Integer shopNo) {
        this.no = shopNo;
    }

    /**
     * Get the value of shopName
     *
     * @return the value of shopName
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of shopName
     *
     * @param shopName new value of shopName
     */
    public void setName(String shopName) {
        this.name = shopName;
    }

    /**
     * Get the value of contactPerson
     *
     * @return the value of contactPerson
     */
    public Person getContactPerson() {
        return contactPerson;
    }

    /**
     * Set the value of contactPerson
     *
     * @param contactPerson new value of contactPerson
     */
    public void setContactPerson(Person contactPerson) {
        this.contactPerson = contactPerson;
    }

    /**
     * Get the value of shopId
     *
     * @return the value of shopId
     */
    public Integer getShopId() {
        return shopId;
    }

    /**
     * Set the value of shopId
     *
     * @param shopId new value of shopId
     */
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }
}
