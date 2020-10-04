package com.cagatay.thy_mvvm.manager;

import android.preference.Preference;

import com.cagatay.thy_mvvm.service.FareFamilyService;

public class DataManager {

    private static DataManager sInstance;

    private DataManager() {
        // This class is not publicly instantiable
    }

    public static synchronized DataManager getInstance() {
        if (sInstance == null) {
            sInstance = new DataManager();
        }
        return sInstance;
    }

    public FareFamilyService getFareFamilyService(){
        return FareFamilyService.getInstance();
    }
}
