package com.sematec.android.advanced.androidprivatenoori.mvvm;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.sematec.android.advanced.androidprivatenoori.R;

public class TestMVVMActivity extends AppCompatActivity {

    TestMVVMViewModel viewModel;

    private static final String TAG = "TestMVVMActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_mvvm);

        viewModel = new ViewModelProvider(this).get(TestMVVMViewModel.class);

        viewModel.getNameLiveData().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Log.d(TAG, s);
            }
        });

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                viewModel.getName(1);
            }
        }, 1000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                viewModel.getName(2);
            }
        }, 2000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                viewModel.getName(3);
            }
        }, 3000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                viewModel.getName(4);
            }
        }, 4000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                viewModel.getName(5);
            }
        }, 5000);

    }
}
