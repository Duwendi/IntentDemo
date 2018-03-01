package com.example.qiu.intentdemo.duwendi.sdcardopertaion;

import android.content.Context;
import android.os.Environment;
import android.util.Log;

/**
 * Created by admin on 2018/3/1.
 */

public class Utils {
    private static final String TAG = "Utils";

    /**
     *功能：获取sd卡目录
     * @return
     */
    public static String getSDPath(){
        String sdPath=null;
        if(checkSDCardState()){
            sdPath = Environment.getExternalStorageDirectory().toString();
        }
        Log.i(TAG, "getSDPath: sdPth"+sdPath);
        Log.i(TAG, "getSDPath: getSdState"+Environment.getExternalStorageState());
        return  sdPath;
    }
    /**
     * 功能：
     *          写入文件
     */
    public static boolean outputFile()
    /**
     * 功能：
     *          检测SD卡是否可用
     * 返回值
     *          true 可用
     *          false 不可用
     */
    public static boolean checkSDCardState(){
        return Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED);
    }

}
