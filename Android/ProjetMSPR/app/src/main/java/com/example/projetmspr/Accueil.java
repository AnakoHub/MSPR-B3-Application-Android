package com.example.projetmspr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Accueil extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accueil);  //Définition de la vue principale
        Button button = (Button) findViewById(R.id.listeDeCouponButton);   //Appel du bouton qui permet d'acceder à la liste de coupon de réduction
        button.setOnClickListener(new View.OnClickListener()      //Creation du listener sur ce bouton
        {
            public void onClick(View actuelView)    //au clic sur le bouton
            {
                Intent intent = new Intent(Accueil.this, MainActivity.class);  //Lancer l'activité Coupon
                startActivity(intent);    //Afficher la vue
            }
        });
    }
}


