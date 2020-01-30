package com.sematec.android.advanced.androidprivatenoori.mvvm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TestMVVMViewModel extends ViewModel {

    private MutableLiveData<String> nameData = new MutableLiveData<>();

    public void getName(int id) {

        switch (id) {
            case 1:
                nameData.postValue("Name 1");
                break;
            case 2:
                nameData.postValue("Name 2");
                break;
            case 3:
                nameData.postValue("Name 3");
                break;
            case 4:
                nameData.postValue("Name 4");
                break;
            case 5:
                nameData.postValue("Name 5");
                break;

        }

    }

    public LiveData<String> getNameLiveData() {
        return nameData;
    }

}
