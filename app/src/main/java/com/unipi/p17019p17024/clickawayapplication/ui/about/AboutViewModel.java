package com.unipi.p17019p17024.clickawayapplication.ui.about;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AboutViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AboutViewModel() {
    }

    public LiveData<String> getText() {
        return mText;
    }
}