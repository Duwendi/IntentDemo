package com.example.qiu.intentdemo.duwendi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.qiu.intentdemo.R;

/**
 * Created by admin on 2018/3/1.
 */

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dwd_basicfunctiontest);

    }

    /**
     * 按钮监听事件
     * 启动播放视频Activity
     */
    public void displayTest(View btn_displayTest) {
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("*/*");
        startActivityForResult(Intent.createChooser(intent, "选择播放文件"), 123);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode){
            case 123:
                if(resultCode == RESULT_OK){

                }
        }
        super.onActivityResult(requestCode, resultCode, data);

    }
}
