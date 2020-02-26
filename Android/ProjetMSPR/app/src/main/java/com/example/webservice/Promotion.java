package com.example.webservice;

import java.io.Serializable;
import java.util.Date;

public class Promotion implements Serializable {

    private int id;

    private String code;

    private String image;

    private String nom;

    private String expiration;

    private String description;

    public int getId() { return id; }

    public String getNom() { return nom; }

    public String getImage() { return image; }

    public String getExpiration() { return expiration; }

    public String getCode() { return code; }

    public String getDescription() {
        return description;
    }

}
