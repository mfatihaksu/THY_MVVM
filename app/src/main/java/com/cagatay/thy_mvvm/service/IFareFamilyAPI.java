package com.cagatay.thy_mvvm.service;

import com.cagatay.thy_mvvm.model.request.FareFamilyListRequest;
import com.cagatay.thy_mvvm.model.response.FareFamilyListResponse;
import com.cagatay.thy_mvvm.utils.Constants;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;


public interface IFareFamilyAPI {

    @POST(Constants.GETFAREFAMILYLIST)
    @Headers({Constants.APIKEYTITLE + ":" + Constants.APIKEY ,
            Constants.APISECRETTITLE + ":" + Constants.APISECRET})
    Call<FareFamilyListResponse> getFareFamilyList(@Body FareFamilyListRequest fareFamilyListRequest);
}
