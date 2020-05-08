package com.narij.rettest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by kami on 8/12/2017.
 */

public class APIClient {

    public static Retrofit retrofit = null;

    static Retrofit getClient() {



        Gson gson = new GsonBuilder()
                .setLenient()
                .create();


        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.1.200/RetTest2/public/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(client)
                .build();



        return retrofit;
    }





}
