package com.sematec.android.advanced.androidprivatenoori.rx;

import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class TestRxClass {


    public Observable<Integer> getData(){

        return Observable
                .just(1,2,3,4,5)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

}
