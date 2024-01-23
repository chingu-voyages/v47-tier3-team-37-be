package com.cornellnotes.Cornell.Notes.Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String email;

    public Long getId() {
        return id;
    }

    public Account(){}

    public String getFirstName(){return firstName;}

    public void setAccount(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail(){return email;}

    public void setEmail(String email) {
        this.email = email;
    }

    public Account(String firstName, String email){
        this.firstName = firstName;
        this.email = email;
    }
}
