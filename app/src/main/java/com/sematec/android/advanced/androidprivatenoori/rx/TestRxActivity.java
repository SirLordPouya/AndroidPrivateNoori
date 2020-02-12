package com.sematec.android.advanced.androidprivatenoori.rx;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.sematec.android.advanced.androidprivatenoori.R;

import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;


public class TestRxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_rx3);

        TestRxClass tx = new TestRxClass();

        tx.getData()
                .last(10)
                .subscribe(new SingleObserver<Integer>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onSuccess(Integer integer) {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }
                });

    }


}
