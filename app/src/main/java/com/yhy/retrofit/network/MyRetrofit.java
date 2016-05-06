/*
 * Copyright (C) 2015 Drakeet <drakeet.me@gmail.com>
 *
 * This file is part of Meizhi
 *
 * Meizhi is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Meizhi is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Meizhi.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.yhy.retrofit.network;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.yhy.retrofit.network.Interceptor.TokenInterceptor;


import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 *
 * Created by staffy on 24/2/16.
 */
public class MyRetrofit {

    public static final String BASE_URL = "故意报错";
    public static final String SERVER_IMAGEURL = BASE_URL + "v1/image?sign=#sign&rule=#rule";
    final WalkDogApi mDogService;


    final static Gson gson = new GsonBuilder()
//            .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
            .serializeNulls()
            .create();

    MyRetrofit() {
//      client.setReadTimeout(12, TimeUnit.SECONDS);

        TokenInterceptor tokenInterceptor = new TokenInterceptor();

        HttpLoggingInterceptor logInterceptor = new HttpLoggingInterceptor();

        //日志
        if(true){
            logInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        }else{
            logInterceptor.setLevel(HttpLoggingInterceptor.Level.NONE);
        }

        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(tokenInterceptor)
                .addInterceptor(logInterceptor)
                .build();



        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();


        mDogService = retrofit.create(WalkDogApi.class);
    }

    public WalkDogApi getWalkDogService() {
        return mDogService;
    }


}
