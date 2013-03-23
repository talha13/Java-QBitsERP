/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qbits.entity.common;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Topu
 */
public class Role {

    private Integer roleId;
    private String title;
    private boolean status;
    private Set<Employee> employess = new HashSet<>();

    public Set<Employee> getEmployess() {
        return employess;
    }

    public void setEmployess(Set<Employee> employess) {
        this.employess = employess;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
