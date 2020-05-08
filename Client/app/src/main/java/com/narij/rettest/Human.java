package com.narij.rettest;

import com.google.gson.annotations.SerializedName;

/**
 * Created by kami on 8/12/2017.
 */

public class Human {

    @SerializedName("humanId")
    private int human_Id;
    @SerializedName("name")
    private String name;
    @SerializedName("family")
    private String family;

    public int getHuman_Id() {
        return human_Id;
    }

    public void setHuman_Id(int human_Id) {
        this.human_Id = human_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}
