package com.narij.rettest;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;

/**
 * Created by kami on 8/12/2017.
 */

public interface APIInterface {


    @GET("getHumen")
    Call<RetrofitModel> getHumen();

}
