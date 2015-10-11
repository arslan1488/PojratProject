package ru.room108.dmitry.uskov.pojrat.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ru.room108.dmitry.uskov.pojrat.R;

public class ThirdFragment extends AbstractMyFragment {

    public static final String title = "Меню";

    public  ThirdFragment(Activity mActivity){
        super(title, mActivity);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View result=inflater.inflate(R.layout.third_fragment_layout, container, false);

        return result;
    }


}
