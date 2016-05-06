package com.yhy.retrofit;

import android.app.Application;


/**
 * Created by Administrator on 2016/2/24.
 */
public class App extends Application {

    private static App mInstance;


    public static synchronized App getInstance() {
        return mInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        mInstance = this;

        //初始化友盟分享
        initUMengShare();


    }

    public void initUMengShare() {


    }


//    private void initBugTag(){
////        Bugtags.start("ee5e6cd52c47c5d78611df629a8abece", this, Bugtags.BTGInvocationEventBubble);
//        BugtagsOptions options = new BugtagsOptions.Builder().
//                trackingLocation(true).//是否获取位置
//                trackingCrashLog(true).//是否收集crash
//                trackingConsoleLog(true).//是否收集console log
//                trackingUserSteps(true).//是否收集用户操作步骤
//                crashWithScreenshot(true).
//                versionName("1.0.1").//自定义版本名称
//                versionCode(1).//自定义版本号
//                build();
//
//        Bugtags.start("ee5e6cd52c47c5d78611df629a8abece", this, Bugtags.BTGInvocationEventBubble, options);
////        Bugtags.start("ee5e6cd52c47c5d78611df629a8abece", this, Bugtags.BTGInvocationEventBubble);
//
//    }
}
