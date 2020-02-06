package com.example.projetmspr;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Coupon extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState) //A la création de la vue
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coupon); //Afficher la vue portant le nom "coupon"
    }

}
