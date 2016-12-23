package com.example.sagarpreetchadha.numbermagic;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by sagarpreet chadha on 05-07-2016.
 */
public interface APIInterface {
@GET("/{month}/{day}/date")
    Call<date_response> getfact1(@Path("month") String month , @Path("day") String day, @Query("json") boolean json);

    @GET("/{number}/math")
    Call<date_response> getfact2(@Path("number") String number , @Query("json") boolean json);

    @GET("/random/trivia?json=true&max=20&min=10")
    Call<date_response> getfact3();

    @GET("{number}/trivia")
    Call<date_response> getfact4(@Path("number") String number , @Query("json") boolean json);

    @GET("{year}/year")
    Call<date_response> getfact5(@Path("year") String year , @Query("json") boolean json) ;
}
