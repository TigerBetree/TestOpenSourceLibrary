package com.tiger.test.osl.frag;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tiger.test.osl.MyApp;

/**
 * Created by tiger on 2018/3/5.
 */

public abstract class BaseFragment extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        MyApp.logd(this.getClass().getSimpleName() + " -> onAttach.");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MyApp.logd(this.getClass().getSimpleName() + " -> onCreate.");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        MyApp.logd(this.getClass().getSimpleName() + " -> onActivityCreated.");
    }

    @Override
    public void onStart() {
        super.onStart();
        MyApp.logd(this.getClass().getSimpleName() + " -> onStart.");
    }

    @Override
    public void onResume() {
        super.onResume();
        MyApp.logd(this.getClass().getSimpleName() + " -> onResume.");
    }

    @Override
    public void onPause() {
        super.onPause();
        MyApp.logd(this.getClass().getSimpleName() + " -> onPause.");
    }

    @Override
    public void onStop() {
        super.onStop();
        MyApp.logd(this.getClass().getSimpleName() + " -> onStop.");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        MyApp.logd(this.getClass().getSimpleName() + " -> onSaveInstanceState.");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        MyApp.logd(this.getClass().getSimpleName() + " -> onDestroyView.");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        MyApp.logd(this.getClass().getSimpleName() + " -> onDestroy.");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        MyApp.logd(this.getClass().getSimpleName() + " -> onDetach.");
    }
}
