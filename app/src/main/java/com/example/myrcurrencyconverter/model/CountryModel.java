package com.example.myrcurrencyconverter.model;

import android.support.v7.widget.RecyclerView;

import com.example.myrcurrencyconverter.adapter.CountriesAdapter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by User on 16/9/2017.
 */

public class CountryModel{

    @SerializedName("name")
    private String countryName;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }





}
