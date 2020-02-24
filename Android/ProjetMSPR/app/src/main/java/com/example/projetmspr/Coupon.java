package com.example.projetmspr;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.webservice.Promotion;

public class Coupon extends AppCompatActivity implements View.OnClickListener {
    public void onCreate(Bundle savedInstanceState) //A la   creation de la vue
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coupon); //Afficher la vue portant le nom "coupon"
        showBackBtn();
        Button button = (Button) findViewById(R.id.button);   //Appel du bouton pour afficher la liste de coupon
        button.setOnClickListener(new View.OnClickListener()      //Creation du listener sur ce bouton
        {
            public void onClick(View actuelView)    //au clic sur le bouton
            {
                showBackCode();
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

    protected void showBackCode(){
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
