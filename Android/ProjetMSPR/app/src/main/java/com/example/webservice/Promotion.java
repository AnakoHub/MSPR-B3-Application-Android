package com.example.webservice;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Date;

public class Promotion implements Serializable {

    private int id;

    private String code;

    private String url;

    private String nom;

    private String date;

    private String description;

    public int getId() { return id; }

    public String getNom() { return nom; }

    public String getUrl() { return url; }

    public String getDate() { return date; }

    public String getCode() { return code; }

    public String getDescription() {
        return description;
    }

}
