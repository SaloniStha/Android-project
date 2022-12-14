package com.example.helloworld.api;

import okhttp3.OkHttp;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public static Retrofit retrofit = null;
    public static Retrofit getClient(){    //to initialize variable
            if(retrofit == null){
                HttpLoggingInterceptor logging = new HttpLoggingInterceptor();//set variable
                logging.setLevel(HttpLoggingInterceptor.Level.BODY);

                OkHttpClient httpClient = new OkHttpClient.Builder()
                        .addInterceptor(logging)
                        .cache(null)
                        .build();
                retrofit = new Retrofit.Builder()
                        .baseUrl(Api.BASE_URL)
                        .client(httpClient)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
                return retrofit;
            }else{
                return retrofit;
            }
    }

}
