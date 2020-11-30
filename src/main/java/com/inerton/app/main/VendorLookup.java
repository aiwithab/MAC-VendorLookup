package com.inerton.app.main;

import com.inerton.app.model.MacVendor;
import com.inerton.network.ApiClient;
import com.inerton.network.ApiService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.inerton.util.Constants.API_KEY;

public class VendorLookup {

    public static void main (String[] args) {

        ApiService apiService = ApiClient.getClient ().create (ApiService.class);
        apiService.getVendor (API_KEY, "json", "44:38:39:ff:ef:57")
                .enqueue (new Callback<MacVendor> () {
                    @Override
                    public void onResponse (Call<MacVendor> call, Response<MacVendor> response) {
                        System.out.println ("STATUS CODE: " + response.code ());
                        assert response.body () != null;
                        System.out.println ("RESPONSE BODY: " + response.body ().toString ());
                    }

                    @Override
                    public void onFailure (Call<MacVendor> call, Throwable throwable) {
                        System.out.println ("ERROR: " + throwable.toString ());
                    }
                });


    }


}
