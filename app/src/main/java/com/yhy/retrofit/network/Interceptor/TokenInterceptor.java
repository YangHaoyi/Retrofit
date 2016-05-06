package com.yhy.retrofit.network.Interceptor;



import com.yhy.retrofit.App;
import com.yhy.retrofit.PreferencesUtils;
import com.yhy.retrofit.module.User;


import java.io.IOException;

import okhttp3.FormBody;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Buffer;

/**
 * 如果用户已经登录，自动添加uid和token
 * Created by staffy on 2016/2/24.
 */
public class TokenInterceptor implements Interceptor {


    @Override
    public Response intercept(Chain chain) throws IOException {

        Request request = chain.request();
        Request.Builder requestBuilder = request.newBuilder();

        //如果是上传文件
        if (request.body().contentType() != null && request.body().contentType().type().equals("multipart")) {
            request = requestBuilder
                    .url(request.url().newBuilder().addQueryParameter(User.USERID,
                            "1234")
                            .addQueryParameter(User.TOKEN,
                                   "1234").build())
                    .post(request.body())
                    .build();
            return chain.proceed(request);
        }

        String postBodyString = bodyToString(request.body());
        //如果登陆了
        if (true) {

            //故意报错
            RequestBody formBody = new FormBody.Builder()
                    .add(User.USERID, "1234")
                    .add(User.TOKEN, "1234")
                    .build();
            postBodyString += ((postBodyString.length() > 0) ? "&" : "") + bodyToString(formBody);
        }
        request = requestBuilder
                .post(RequestBody.create(MediaType.parse("application/x-www-form-urlencoded;charset=UTF-8"), postBodyString))
                .build();

        return chain.proceed(request);

    }

    public String bodyToString(final RequestBody request) {
        try {
            final RequestBody copy = request;
            final Buffer buffer = new Buffer();
            if (copy != null)
                copy.writeTo(buffer);
            else
                return "";
            return buffer.readUtf8();
        } catch (final IOException e) {
            return "did not work";
        }
    }
}
