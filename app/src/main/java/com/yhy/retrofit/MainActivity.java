package com.yhy.retrofit;

import android.os.Bundle;
import android.provider.Settings;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.Toast;


import com.yhy.retrofit.module.DogBreeds;
import com.yhy.retrofit.module.User;
import com.yhy.retrofit.module.UserInfo;
import com.yhy.retrofit.network.ApiFactory;
import com.yhy.retrofit.network.MyObserver;

import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getRootBreedList();

    }

    private void getRootBreedList() {

        Subscription initSubscription = ApiFactory.getWalkDogSingleton().user()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new MyObserver<UserInfo>() {
                    @Override
                    public void onCompleted() {
                        super.onCompleted();
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                    }

                    @Override
                    public void onSuccess(UserInfo response) {
                        super.onSuccess(response);
                        dealUserInfo(response);

                    }

                    @Override
                    public void onFail(String code, String msg) {
                        super.onFail(code, msg);
                    }
                });
        addSubscription(initSubscription);
    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    User mUser;
    private void dealUserInfo(UserInfo userInfo) {
        mUser = userInfo.getUser();
        Toast.makeText(MainActivity.this,mUser.getNick(),Toast.LENGTH_SHORT).show();
    }


}
