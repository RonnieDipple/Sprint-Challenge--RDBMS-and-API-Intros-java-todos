package com.lambdaschool.demo.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "roles")
public class Role {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long roleid;

    @Column(nullable = false, unique = true)//check if null and name is unique
    private String rolename;


    ///////////Foreign Key////////////////
    @ManyToMany(mappedBy = "roles")
    private List<User> users = new ArrayList<>();


    ////////////////BOILER PLATE//////////////////////////////////


    //Do not put lists here
    public Role(String rolename) {
        this.rolename = rolename;

    }

    public Role(){}//without this there are issues in RoleServiceImpl

    public long getRoleid() {
        return roleid;
    }

    public void setRoleid(long roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
