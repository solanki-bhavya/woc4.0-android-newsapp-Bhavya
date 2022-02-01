package com.linuxuser.apibasednewsapp;

import androidx.annotation.RestrictTo;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BackendOfApplication {
    public static Retrofit retrofit=null;

    public static ApiInterface getApiInterface()
    {
        if(retrofit==null) {
            retrofit = new Retrofit.Builder().baseUrl(ApiInterface.baseURL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit.create(ApiInterface.class);
    }
}
