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


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView textViewResult;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  //Définition de la vue principale
        showBackBtn();

        textViewResult = findViewById(R.id.activity_main_promotion);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.1.32:9000/")
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
                   /* content += "userID: " + Post.getUserId() + "\n";
                    content += "ID: " + Post.getId() + "\n";
                    content += "Title: " + Post.getTitle() + "\n";
                    content += "Text " + Post.getText() + "\n";*/

                    textViewResult.append(content);
                }
            }

            @Override
            public void onFailure(Call<List<Promotion>> call, Throwable t) {
                textViewResult.setText(t.getMessage());
            }
        });

    }

    protected void showBackBtn(){
        ImageView imageView=findViewById(R.id.imageViewClose);
        if(imageView!=null) {
            imageView.setVisibility(View.VISIBLE);
            imageView.setOnClickListener(this);
        }
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageViewClose:
                finish();
                break;
        }
    }
}
