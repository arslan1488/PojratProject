package ru.room108.dmitry.uskov.pojrat.fragments;

import android.app.Activity;
import android.support.v4.app.Fragment;

abstract public class AbstractMyFragment extends Fragment{

    private final String TITLE;

    private final Activity mActivity;

    private int iconId;

    AbstractMyFragment(String TITLE, Activity mActivity, int iconId){
        this.TITLE=TITLE;
        this.mActivity = mActivity;
        this.iconId=iconId;
    }

    public String getTitle(){
        return TITLE;
    }

    public Activity getParentActivity(){
        return mActivity;
    }

    public int getIconId() {
        return iconId;
    }
}
