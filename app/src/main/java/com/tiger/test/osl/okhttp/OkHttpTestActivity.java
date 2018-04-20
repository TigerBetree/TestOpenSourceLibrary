package com.tiger.test.osl.okhttp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.tiger.test.osl.MyApp;
import com.tiger.test.osl.R;
import com.tiger.test.osl.databinding.ActivityOkhttpTestBinding;
import com.tiger.test.osl.utils.MyExecutor;

import java.io.IOException;

import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by tiger on 2018/3/19.
 */

public class OkHttpTestActivity extends Activity implements View.OnClickListener {

    public static void startActivity(@Nullable Context context) {
        Intent intent = new Intent(context, OkHttpTestActivity.class);
        context.startActivity(intent);
    }

    private ActivityOkhttpTestBinding mBinding = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_okhttp_test);

        initView();
    }

    private void initView() {
        mBinding.btGet.setOnClickListener(this);
        mBinding.btPost.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_get:
                MyExecutor.getExecutor().post(new Runnable() {
                    @Override
                    public void run() {
                        doTestGet();
                    }
                });
                break;
            case R.id.bt_post:
                MyExecutor.getExecutor().post(new Runnable() {
                    @Override
                    public void run() {
                        doTestPost();
                    }
                });
                break;
        }
    }

    private void doTestGet() {
        Request request = new Request.Builder()
                .url("http://publicobject.com/helloworld.txt").build();

        try {
            Response response = MyOkHttpClient.getInstance().exec(request);

            if (response.isSuccessful()) {
                MyApp.logd("content : " + response.body().string());
            } else {
                MyApp.logd("failed.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void doTestPost() {

    }
}
