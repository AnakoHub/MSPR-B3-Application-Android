package com.example.projetmspr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * <b>Accueil is the classe will execute the functionnality of Accueil view  </b>
 * 
 * @author Ludivine CAPELLI
 */
public class Accueil extends AppCompatActivity implements View.OnClickListener {
    /**
     *
     * @param savedInstanceState
     */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**
         *
         * Method to define the main view
         *
         */
        setContentView(R.layout.accueil);
        /**
         * method showBackButton is called
         */
        showBackBtn();
        /**
         *
         * button is called for give access to the coupon list
         *
         */
        Button button = (Button) findViewById(R.id.listeDeCouponButton);
        /**
         *
         * method to create listener on the button
         *
         */
        button.setOnClickListener(new View.OnClickListener()
        {
            /**
             *
             * Method to display the view when clicking on the button
             *
             * @param actuelView
             */
            public void onClick(View actuelView)
            {
                Intent intent = new Intent(Accueil.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    /**
     * Method to show the image view when the method is call
     */
    protected void showBackBtn(){
        ImageView imageView=findViewById(R.id.imageViewClose);
        if(imageView!=null) {
            imageView.setVisibility(View.VISIBLE);
            imageView.setOnClickListener(this);
        }
    }

    /**
     * Method to display the view when clicking on the image view
     *
     * @param v
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageViewClose:
                finish();
                break;
        }
    }
}


