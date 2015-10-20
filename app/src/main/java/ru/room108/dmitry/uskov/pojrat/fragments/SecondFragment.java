package ru.room108.dmitry.uskov.pojrat.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import ru.room108.dmitry.uskov.pojrat.MainActivity;
import ru.room108.dmitry.uskov.pojrat.R;
import ru.room108.dmitry.uskov.pojrat.view.ImageButtonView;

public class SecondFragment extends AbstractMyFragment {

    public static final String title = "Рулетка";

    public static final int ICON_ID= R.drawable.ic_action_refresh;

    //private ImageButtonView peopleCount;

    public  SecondFragment(Activity mActivity){
        super(title, mActivity, ICON_ID);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View result=inflater.inflate(R.layout.second_fragment_layout, container, false);
        //peopleCount = new ImageButtonView(result, R.id.count_people_image, R.drawable.button_watch_2_selector);
        /*result.findViewById(R.id.count_people_image).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/
        return result;
    }

    @Override
    public void onResume() {
        super.onResume();

    }



}
