package com.inerton.network;

import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

public class ApiClient {

    static final String BASE_URL = "https://api.macaddress.io/v1/";

    private static Retrofit retrofit = null;

    public static Retrofit getClient(){
        if (retrofit == null) {

            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }

        return retrofit;
    }
}
