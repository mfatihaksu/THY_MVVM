package com.cagatay.thy_mvvm.viewmodel;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.cagatay.thy_mvvm.service.FareFamilyService;

public class MainViewModelFactory implements ViewModelProvider.Factory {

    private final FareFamilyService fareFamilyService;

    public MainViewModelFactory(FareFamilyService fareFamilyService) {
        this.fareFamilyService = fareFamilyService;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(MainViewModel.class)) {
            return (T) new MainViewModel(fareFamilyService);
        }

        throw new IllegalArgumentException("Unknown ViewModel class");
    }

}
