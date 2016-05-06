package com.yhy.retrofit.network;



import com.yhy.retrofit.Result;

import java.net.UnknownHostException;


import retrofit2.adapter.rxjava.HttpException;
import rx.Observer;


/**
 * Created by Administrator on 2016/2/24 0024.
 */
public abstract class MyObserver<T> implements Observer<Result<T>> {

    @Override
    public void onCompleted() {
//        LogUtil.d("onCompleted");
    }

    @Override
    public void onError(Throwable e) {

//        LogUtil.d("onError");

        if (e instanceof HttpException) {
            HttpException response = (HttpException)e;
            int code = response.code();

        }

        if(e instanceof UnknownHostException){
            UnknownHostException response = (UnknownHostException)e;

        }else {
            e.printStackTrace();
        }
    }

    @Override
    public void onNext(Result<T> t) {
        if(t.getCode().equals(Status.SUCCESS)){
            onSuccess(t.getData());
        }else{
            onFail(t.getCode(),t.getMsg());
        }
    }

    public void onSuccess(T response){
//        LogUtil.d("onSuccess");
    }

    public void onFail(String code, String msg){

        //如果登陆超时
//        LogUtil.d("onFail");

    }

}
