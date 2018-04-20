package com.tiger.test.osl.frag;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tiger.test.osl.MyApp;
import com.tiger.test.osl.R;

/**
 * Created by tiger on 2018/3/5.
 */

public class Fragment3 extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        MyApp.logd(this.getClass().getSimpleName() + " -> onCreateView.");
        return inflater.inflate(R.layout.fragment3, container, false);
    }
}
