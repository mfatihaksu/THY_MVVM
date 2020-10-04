package com.cagatay.thy_mvvm.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.cagatay.thy_mvvm.R;
import com.cagatay.thy_mvvm.manager.DataManager;
import com.cagatay.thy_mvvm.model.request.FareFamilyListRequest;
import com.cagatay.thy_mvvm.service.FareFamilyService;
import com.cagatay.thy_mvvm.viewmodel.MainViewModel;
import com.cagatay.thy_mvvm.viewmodel.MainViewModelFactory;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private FareFamilyService fareFamilyService;
    MainViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewModel = createViewModel();
        FareFamilyListRequest request = new FareFamilyListRequest();
        request.isMilesRequest = "F";
        request.portList = new ArrayList<String>();
        request.portList.add("IST");
        request.portList.add("JFK");
        viewModel.GetFareFamilyList(request);
    }

    private MainViewModel createViewModel() {
        MainViewModelFactory factory = new MainViewModelFactory(DataManager.getInstance().getFareFamilyService());
        return ViewModelProviders.of(this, factory).get(MainViewModel.class);
    }
}
