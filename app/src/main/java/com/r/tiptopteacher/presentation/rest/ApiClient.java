package com.r.tiptopteacher.presentation.rest;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Who Dat on 3/27/2018.
 */

public class ApiClient {

    private static Retrofit retrofit = null;

    static Retrofit getClient(){
        // Step 1) Get a logging interceptor
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        // Step 2) Set the logging level on the interceptor
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        // Step 3) Create us a client and add the interceptor
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        // Step 4) Create Retrofit object
        retrofit = new Retrofit.Builder()
                                .baseUrl("https://block.io/api/v2/")
                                .addConverterFactory(GsonConverterFactory.create())
                                .client(client)
                                .build();

        return  retrofit;

    }
}
