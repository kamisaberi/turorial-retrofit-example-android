package com.narij.rettest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by kami on 8/12/2017.
 */

public class RetrofitModel {

    @SerializedName("humen")
    ArrayList<Human> humen = new ArrayList<>();

}
