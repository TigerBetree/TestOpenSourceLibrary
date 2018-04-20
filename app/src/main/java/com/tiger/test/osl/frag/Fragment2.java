package com.tiger.test.osl.frag;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tiger.test.osl.MainActivity;
import com.tiger.test.osl.MyApp;
import com.tiger.test.osl.R;
import com.tiger.test.osl.databinding.Fragment2Binding;
import com.tiger.test.osl.event.SwitchTabEvent;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by tiger on 2018/3/5.
 */

public class Fragment2 extends BaseFragment {

    private Fragment2Binding fragment2Binding = null;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        MyApp.logd(this.getClass().getSimpleName() + " -> onCreateView.");

        fragment2Binding = DataBindingUtil.inflate(inflater, R.layout.fragment2, container, false);
        fragment2Binding.setListener(this);

        return fragment2Binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    public void switchToFragment3(View view) {
        EventBus.getDefault().post(new SwitchTabEvent(MainActivity.TAB_FRAG_3));
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
