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


import com.yhy.retrofit.Result;
import com.yhy.retrofit.module.DogBreeds;
import com.yhy.retrofit.module.UserInfo;

import okhttp3.RequestBody;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import rx.Observable;

// @formatter:off

/**
 * Created by drakeet on 8/9/15.
 */
public interface WalkDogApi {


//    @FormUrlEncoded
//    @POST("v1/init")
//    public Observable<Result<Init>> init(
//            @Field("versionCode") String versionCode,
//            @Field("system") String system
//    );
//
//    @POST("v1/unauditplaces")
//    public Observable<Result<Unauditplaces>> unauditplaces();
//
//
//    @FormUrlEncoded
//    @POST("v1/nearestplace")
//    public Observable<Result<Nearestplace>> nearestplace(
//            @Field("lat") String lat,
//            @Field("long") String lon
//    );
//
//
//
//    @FormUrlEncoded
//    @POST("v1/loginsmscode")
//    public Observable<Result<LoginSmsCode>> loginsmscode(
//            @Field("mobile") String mobile
//    );
//
//    @FormUrlEncoded
//    @POST("v1/login")
//    public Observable<Result<Login>> login(
//            @Field("mobile") String mobile,
//            @Field("code") String code,
//            @Field("system") String system
//    );
//
//    @FormUrlEncoded
//    @POST("v1/loginwechat")
//    public Observable<Result<Login>> loginwechat(
//            @Field("openId") String openId,
//            @Field("accessToken") String accessToken,
//            @Field("system") String system
//    );
//
//    @FormUrlEncoded
//    @POST("v1/loginqq")
//    public Observable<Result<Login>> loginqq(
//            @Field("openId") String openId,
//            @Field("accessToken") String accessToken,
//            @Field("system") String system
//    );
//
//
//    @POST("v1/user")
//    public Observable<Result<UserInfo>> user();
//
//    @FormUrlEncoded
//    @POST("v1/userupdate")
//    public Observable<Result<UserInfo>> userupdate(
//            @Field("avatar") String avatar,
//            @Field("nick") String nick,
//            @Field("gender") String gender
//    );
//
//    @POST("v1/usercenter")
//    public Observable<Result<UserCenter>> usercenter();
//
//
//    @POST("v1/reds")
//    public Observable<Result<RedList>> reds();
//
//    @FormUrlEncoded
//    @POST("v1/redopen")
//    public Observable<Result<String>> redopen(
//            @Field("redId") String redId
//    );

    @POST("v1/user")
    public Observable<Result<UserInfo>> user();

//    @FormUrlEncoded
//    @POST("v1/dogcreate")
//    public Observable<Result<DogInfo>> dogcreate(
//            @Field("nick") String nick,
//            @Field("gender") String gender,
//            @Field("avatar") String avatar,
//            @Field("dogBreedFCI") String dogBreedFCI,
//            @Field("bornAt") String bornAt
//    );
//
//    @FormUrlEncoded
//    @POST("v1/dog")
//    public Observable<Result<DogInfo>> dog(
//            @Field("dogId") String dogId
//    );
//
//    @FormUrlEncoded
//    @POST("v1/dogupdate")
//    public Observable<Result<DogInfo>> dogupdate(
//            @Field("dogId") String dogId,
//            @Field("nick") String nick,
//            @Field("gender") String gender,
//            @Field("avatar") String avatar,
//            @Field("dogBreedFCI") String dogBreedFCI,
//            @Field("bornAt") String bornAt
//    );
//
//
//    @Multipart
//    @POST("v1/imageupload")
//    public Observable<Result<ImageUpload>> imageupload(
//            @Part("image\";filename=\"image.png\"") RequestBody image
//    );
//
////    @FormUrlEncoded
////    @POST("v1/imageupload")
////    public Observable<Result<ImageUpload>> imageupload(
////        @FieldMap Map<String,File> image
////    );
//
//    @FormUrlEncoded
//    @POST("v1/walks")
//    public Observable<Result<Walks>> walks(
//            @Field("beforeDate") String beforeDate
//    );
//
//    @FormUrlEncoded
//    @POST("v1/walkdetail")
//    public Observable<Result<WalkDetailInfo>> walkdetail(
//            @Field("walkId") String walkId
//    );
//
//    @FormUrlEncoded
//    @POST("v1/walkstart")
//    public Observable<Result<String>> walkstart(
//            @Field("dogIdStr") String dogIdStr,
//            @Field("lat") String lat,
//            @Field("long") String lon
//    );
//
//    @FormUrlEncoded
//    @POST("v1/walk")
//    public Observable<Result<WalkingDataInfo>> walk(
//            @Field("lat") String lat,
//            @Field("long") String lon
////            @Field("isTest") String isTest
//    );
//
//    @POST("v1/walkend")
//    public Observable<Result<WalkEnd>> walkend();
//
//    @POST("v1/walkforcingend")
//    public Observable<Result<String>> walkforcingend();
//
//    @FormUrlEncoded
//    @POST("v1/surroundings")
//    public Observable<Result<SurroundingUsers>> surroundingusers(
//            @Field("lat") String lat,
//            @Field("long") String lo
//    );
//
//    @FormUrlEncoded
//    @POST("v1/surroundings")
//    public Observable<Result<SurroundingPlaces>> surroundingplaces(
//            @Field("lat") String lat,
//            @Field("long") String lo
//    );
//
//    @FormUrlEncoded
//    @POST("v1/placecreate")
//    public Observable<Result<PlaceCreate>> placecreate(
//            @Field("radii") String radii,
//            @Field("lat") String lat,
//            @Field("long") String lon,
//            @Field("weekStart") String weekStart,
//            @Field("weekEnd") String weekEnd,
//            @Field("timeStart") String timeStart,
//            @Field("timeEnd") String timeEnd,
//            @Field("surrounding") String surrounding
//    );
//
//    @FormUrlEncoded
//    @POST("v1/placedetail")
//    public Observable<Result<PlaceDetail>> placedetail(
//            @Field("placeId") String placeId
//    );
//
//    @FormUrlEncoded
//    @POST("v1/notices")
//    public Observable<Result<Notices>> notices(
//            @Field("page") String page
//    );
//
//    @FormUrlEncoded
//    @POST("v1/noticeread")
//    public Observable<Result<String>> noticeread(
//            @Field("noticeId") String noticeId
//    );
//
//    @FormUrlEncoded
//    @POST("v1/sharecallback")
//    public Observable<Result<ShareRed>> sharecallback(
//            @Field("walkId") String walkId
//    );
//    @POST("v1/placecorrectiontexts")
//    public Observable<Result<Texts>> placecorrectiontexts();
//
//    @POST("v1/noticeunreadcount")
//    public Observable<Result<NoticeUnReadCount>> noticeunreadcount();
//
//
//    @POST("v1/Invitationdata")
//    public Observable<Result<Invitationdata>> invitationdata();
//
//    @POST("v1/goods")
//    public Observable<Result<GoodsInfo>> goods();
//
//    @FormUrlEncoded
//    @POST("v1/good")
//    public Observable<Result<GoodInfo>> gooddetail(
//            @Field("goodId") String goodId
//    );
//
//    @POST("v1/usershippingaddress")
//    public Observable<Result<UserShippingAddressInfo>> usershippingaddress();
//
//
//    @FormUrlEncoded
//    @POST("v1/usershippingaddresscreateupdate")
//    public Observable<Result<UserShippingAddressInfo>> usershippingaddresscreateupdate(
//            @Field("name") String name,
//            @Field("mobile") String mobile,
//            @Field("address") String address,
//            @Field("detail") String detail
//    );
//
//    @FormUrlEncoded
//    @POST("v1/goodexchangedo")
//    public Observable<Result<String>> goodexchangedo(
//            @Field("goodId") String goodId,
//            @Field("userShippingAddressId") String userShippingAddressId
//    );
//
//    @FormUrlEncoded
//    @POST("v1/goodexchanges")
//    public Observable<Result<GoodExChangesInfo>> goodexchanges(
//            @Field("page") String page
//    );
//
//
//    @FormUrlEncoded
//    @POST("v1/goodexchangeexpress")
//    public Observable<Result<TracksInfo>> goodexchangeexpress(
//            @Field("goodExchangeId") String goodExchangeId
//    );

}
