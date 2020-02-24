package com.example.projetmspr;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

/**
 * <b>Connexion is the classe will execute the functionnality of connexion view  </b>
 *
 * @author Ludivine CAPELLI
 */
public class Connexion extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**
         *
         * Method to define the main view
         *
         */
        setContentView(R.layout.connexion);  //Définition de la vue principale

        /**
         *
         * button is called for give access to the accueil view
         *
         */
        Button button = (Button) findViewById(R.id.connexionButton);   //Appel du bouton de connexion"
        button.setOnClickListener(new View.OnClickListener()      //Creation du listener sur ce bouton
        {
            /**
             * Method to display the view when clicking on the accueil view
             *
             * @param v
             */
            public void onClick(View actuelView)    //au clic sur le bouton
            {
                Intent intent = new Intent(Connexion.this, Accueil.class);  //Lancer l'activité Coupon
                startActivity(intent);    //Afficher la vue
            }
        });
    }
}




