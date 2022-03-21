package com.example.assignment1.ui.stared;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class StaredViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public StaredViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is stared fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}