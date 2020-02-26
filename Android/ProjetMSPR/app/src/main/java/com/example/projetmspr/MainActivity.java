package com.example.projetmspr;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

import com.example.webservice.GoStyleApi;
import com.example.webservice.Promotion;
import com.example.webservice.Promotion;
import com.example.webservice.Promotion;

import java.util.ArrayList;
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
    private MutableLiveData<List<Promotion>> listMutableLiveData = new MutableLiveData<>();
    private List<Promotion> promotions = new ArrayList<>();

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

                promotions = response.body();
                listMutableLiveData.setValue(promotions);


            }

            @Override
            public void onFailure(Call<List<Promotion>> call, Throwable t) {
                textViewResult.setText(t.getMessage());
            }
        });

        PromotionAdapter promotionAdapter = new PromotionAdapter(this, promotions);
        ListView listView = (ListView) findViewById(R.id.activity_main_promotion);
        listView.setAdapter(promotionAdapter);
        listMutableLiveData.observe(this, new Observer<List<Promotion>>() {
            @Override
            public void onChanged(List<Promotion> promotions) {
                promotionAdapter.clear();
                promotionAdapter.addAll(promotions);
                promotionAdapter.notifyDataSetChanged();
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Promotion promotion = (Promotion) parent.getItemAtPosition(position);
                Intent intent = new Intent(MainActivity.this,Coupon.class);
                intent.putExtra("promo",promotion);

                startActivity(intent);
            }
        });


    }

    /**
     * Method to show the image view when the method is call
     */
    protected void showBackBtn() {
        ImageView imageView = findViewById(R.id.imageViewClose);
        if (imageView != null) {
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
        switch (v.getId()) {
            case R.id.imageViewClose:
                finish();
                break;
        }
    }

    public void ChangeActivity(View view) {
        Intent intent = new Intent(this, Coupon.class);
        startActivity(intent);
    }
}
