package com.supsms.model;

/**
 * Created by Adeline on 27/01/2015.
 */
public class Message {

    private Long id;
    private String message;
    private String Sphone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSphone() {
        return Sphone;
    }

    public void setSphone(String sphone) {
        Sphone = sphone;
    }

}
