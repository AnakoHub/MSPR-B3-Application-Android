package com.example.projetmspr;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.webservice.GoStyleApi;
import com.example.webservice.Promotion;
import com.example.webservice.Promotion;
import com.example.webservice.Promotion;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * <b>MainActivity is the classe will execute the functionnality of MainActivity view  </b>
 *
 * @author Ludivine CAPELLI
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textViewResult;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**
         *
         * Method to define the main view
         *
         */
        setContentView(R.layout.activity_main);
        /**
         * method showBackButton is called
         */
        showBackBtn();

        /**
         *
         * textView is called for give access to the coupon view
         *
         */
        textViewResult = findViewById(R.id.activity_main_promotion);
        textViewResult.setOnClickListener(new View.OnClickListener()      //Creation du listener sur ce bouton
        {
            /**
             * Method to display the view when clicking on the accueil view
             *
             * @param v
             */
            public void onClick(View actuelView)    //au clic sur le bouton
            {
                Intent intent = new Intent(MainActivity.this, Coupon.class);  //Lancer l'activité Coupon
                startActivity(intent);    //Afficher la vue
            }
        });

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://172.20.10.2:9384/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GoStyleApi goStyleApi = retrofit.create(GoStyleApi.class);

        Call<List<Promotion>> call = goStyleApi.getPromotion();

        call.enqueue(new Callback<List<Promotion>>() {
            @Override
            public void onResponse(Call<List<Promotion>> call, Response<List<Promotion>> response) {
                if (!response.isSuccessful()) {
                    textViewResult.setText("Code: " + response.code());
                    return;
                }

                List<Promotion> Promotions = response.body();

                for(Promotion Promotion : Promotions) {
                    String content = "";
                    content += "ID: " + Promotion.getId() + "\n";
                    content += "Code: " + Promotion.getCode() + "\n";
                    content += "Nom: " + Promotion.getNom() + "\n";
                    content += "Description: " + Promotion.getDescription() + "\n";

                    textViewResult.append(content);
                }
            }

            @Override
            public void onFailure(Call<List<Promotion>> call, Throwable t) {
                textViewResult.setText(t.getMessage());
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
