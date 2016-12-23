package com.example.sagarpreetchadha.numbermagic;

import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by sagarpreet chadha on 05-07-2016.
 */
public class client {
    private static APIInterface service;

    public static APIInterface getService() {

        if (service == null) {


            OkHttpClient client = new OkHttpClient.Builder()
                    .connectTimeout(15, TimeUnit.SECONDS)
                    .readTimeout(45, TimeUnit.SECONDS)

                    .addInterceptor(new Interceptor() {
                        @Override
                        public Response intercept(Chain chain) throws IOException {
                            Request r = chain.request();
                            r = r.newBuilder().addHeader("user-key" ,"7945cd7da36627109b82f30603ca40dd")
                                    .addHeader("Accept" ,"application/json")
                                    .build();
                            return chain.proceed(r);
                        }
                    })
                    .build();

            Retrofit r = new Retrofit.Builder().baseUrl("").
                    addConverterFactory(GsonConverterFactory.create(
                            new GsonBuilder().create())).client(client)
                    .build();
            service = r.create(APIInterface.class);
        }
        return service;
    }
}
