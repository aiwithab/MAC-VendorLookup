package com.inerton.network;

import com.inerton.app.model.MacVendor;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import static com.inerton.network.ApiClient.BASE_URL;

public interface ApiService {

    @GET(BASE_URL)
    Call<MacVendor> getVendor(@Query ("apiKey") String apiKey,
                              @Query ("output") String outPutType,
                              @Query ("search") String macAddress);

}
