package com.cagatay.thy_mvvm.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.cagatay.thy_mvvm.model.request.FareFamilyListRequest;
import com.cagatay.thy_mvvm.model.response.FareFamilyListResponse;
import com.cagatay.thy_mvvm.service.FareFamilyService;
import com.google.gson.Gson;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainViewModel extends ViewModel {

    private MutableLiveData<List<FareFamilyListResponse>> fareFamilyListResponse;

    private FareFamilyService fareFamilyService;

    MainViewModel(FareFamilyService fareFamilyService){
        this.fareFamilyService = fareFamilyService;
        fareFamilyListResponse = new MutableLiveData<>();
    }

    public MutableLiveData<List<FareFamilyListResponse>> getFareFamilyList() {
        return fareFamilyListResponse;
    }

    public void setFareFamilyList(List<FareFamilyListResponse> fareFamilyList) {
        fareFamilyListResponse.postValue(fareFamilyList);
    }

    public void GetFareFamilyList(FareFamilyListRequest fareFamilyListRequest){
        Call<FareFamilyListResponse> fareFamilyListCall = fareFamilyService.getFareFamilyAPI().getFareFamilyList(fareFamilyListRequest);
        fareFamilyListCall.enqueue(new Callback<FareFamilyListResponse>() {
            @Override
            public void onResponse(Call<FareFamilyListResponse> call, Response<FareFamilyListResponse> response) {
                    if (response.body() != null){
                    }
                    FareFamilyListResponse fareFamilyListResponse = response.body();
                    System.out.println("Message : " + fareFamilyListResponse.message.description);
            }

            @Override
            public void onFailure(Call<FareFamilyListResponse> call, Throwable t) {

            }
        });
    }


}
