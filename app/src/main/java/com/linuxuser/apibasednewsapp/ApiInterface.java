package com.linuxuser.apibasednewsapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    String baseURL="https://newsapi.org/v2/";

    @GET("top-headlines")
    Call<NewsResponse> getNews(@Query("country") String country,@Query("pageSize") int pageSize,@Query("apikey") String apiKey);

    @GET("top-headlines")
    Call<NewsResponse> getCategoryNews(@Query("country") String country,@Query("category") String category,@Query("pageSize") int pageSize,@Query("apikey") String apiKey);

}
