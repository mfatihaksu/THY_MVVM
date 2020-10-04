package com.cagatay.thy_mvvm.service;

import com.cagatay.thy_mvvm.utils.Constants;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.Retrofit;

public class FareFamilyService {

    private static FareFamilyService instance;

    private IFareFamilyAPI fareFamilyAPI;

    public static FareFamilyService getInstance(){
//        if(instance == null)
//        {
//            return new FareFamilyService();
//        }else{
//            return instance;
//        }
       return instance== null ? instance = new FareFamilyService() : instance;
    }

    public FareFamilyService(){
        Retrofit retrofit = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).baseUrl(Constants.BASE_URL).build();
        fareFamilyAPI = retrofit.create(IFareFamilyAPI.class);
    }

    public IFareFamilyAPI getFareFamilyAPI(){
        return fareFamilyAPI;
    }
}
