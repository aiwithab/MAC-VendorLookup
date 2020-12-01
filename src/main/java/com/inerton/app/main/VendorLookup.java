package com.inerton.app.main;

import com.inerton.network.ApiClient;
import com.inerton.network.ApiService;
import rx.schedulers.Schedulers;

import static com.inerton.util.Constants.API_KEY;

public class VendorLookup {

    public static void main (String[] args) {

        ApiService apiService = ApiClient.getClient ().create (ApiService.class);
        apiService.getVendor (API_KEY, "json", "44:38:39:ff:ef:57")
                .observeOn (Schedulers.io ())
                .subscribe (
                        System.out::println,
                        Throwable::printStackTrace,
                        System.out::println);


    }


}
