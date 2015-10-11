package ru.room108.dmitry.uskov.pojrat.fragments;

import android.app.Activity;
import android.support.v4.app.Fragment;

abstract public class AbstractMyFragment extends Fragment{

    private final String TITLE;

    private final Activity mActivity;

    AbstractMyFragment(String TITLE, Activity mActivity){
        this.TITLE=TITLE;
        this.mActivity = mActivity;
    }

    public String getTitle(){
        return TITLE;
    }

    public Activity getParentActivity(){
        return mActivity;
    }
}
