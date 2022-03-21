package com.example.assignment1.ui.sharewithme;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SharedWithMeModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public SharedWithMeModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is share with me fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}