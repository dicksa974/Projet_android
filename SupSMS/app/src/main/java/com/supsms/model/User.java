package com.supsms.model;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

/**
 * Created by Adeline on 25/01/2015.
 */
@Entity
@Index
public class User{

    @Id
    private Long id;
    private String username;
    private String password;
    private String phone;
    private String lastname;
    private String firstname;
    private int cpostal;
    private String address;
    private String email;

    //Test un User
    private User() {}

    public User(Long id, String username, String password, String phone, String lastname, String firstname, int cpostal, String address, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.lastname = lastname;
        this.firstname = firstname;
        this.cpostal = cpostal;
        this.address = address;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getCpostal() {
        return cpostal;
    }

    public void setCpostal(int cpostal) {
        this.cpostal = cpostal;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
