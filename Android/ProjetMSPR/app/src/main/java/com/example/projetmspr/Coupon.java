package com.example.projetmspr;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Coupon extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState) //A la   creation de la vue
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coupon); //Afficher la vue portant le nom "coupon"
        Button button = (Button) findViewById(R.id.button);   //Appel du bouton pour afficher la liste de coupon
        button.setOnClickListener(new View.OnClickListener()      //Creation du listener sur ce bouton
        {
            public void onClick(View actuelView)    //au clic sur le bouton
            {
                showBackBtn();
            }
        });
    }

    protected void showBackBtn(){
        TextView textView=findViewById(R.id.textView3);
        if(textView!=null){
            textView.setVisibility(View.VISIBLE);
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });

        }
    }

}
