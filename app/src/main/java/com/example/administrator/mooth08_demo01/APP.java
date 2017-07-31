package com.example.administrator.mooth08_demo01;

import android.app.Application;

import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechUtility;

/**
 * data:2017/7/30
 * author:汉堡(Administrator)
 * function:
 */

public class APP extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // 将“12345678”替换成您申请的APPID，申请地址：http://open.voicecloud.cn
        SpeechUtility.createUtility(this, SpeechConstant.APPID +"=597dc776 ");

    }
}
