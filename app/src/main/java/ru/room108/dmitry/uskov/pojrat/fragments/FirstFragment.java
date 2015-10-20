package ru.room108.dmitry.uskov.pojrat.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ru.room108.dmitry.uskov.pojrat.R;

public class FirstFragment extends AbstractMyFragment {

    public static final String title = "Избранное";

    public static final int ICON_ID= R.drawable.ic_action_good;

    public FirstFragment(Activity mActivity){
        super(title, mActivity, ICON_ID);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View result=inflater.inflate(R.layout.first_fragment_layout, container, false);

        return result;
    }

}
