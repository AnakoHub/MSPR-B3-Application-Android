package com.example.webservice;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GoStyleApi {

    @GET("mspr/gostyle/liste-promotion")
    Call<List<Promotion>> getPromotion();
}
