/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qbitserp.entity.product;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Topu
 */
public class Category {

    private Integer id;
    private String title;
    private boolean status;
    private Integer createdBy;
    private Date createdDate;
    private Set<SubCategory> subCategories = new HashSet<>();

    public Set<SubCategory> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(Set<SubCategory> subCategories) {
        this.subCategories = subCategories;
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
     * Get the value of status
     *
     * @return the value of status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * Set the value of status
     *
     * @param status new value of status
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * Get the value of title
     *
     * @return the value of title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set the value of title
     *
     * @param title new value of title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(Integer id) {
        this.id = id;
    }
}
