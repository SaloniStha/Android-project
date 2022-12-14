package com.example.helloworld.api;

import com.example.helloworld.response.FoodResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("api/food")
    Call<FoodResponse> getFood();
}
