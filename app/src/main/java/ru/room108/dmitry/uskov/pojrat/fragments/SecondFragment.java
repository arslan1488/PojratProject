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

    private static final int SIZE_INPUT_SUM_LAYOUT_PX_X = 85;

    private static final int SIZE_NEXT_STEP_PX_X = 80;

    private static final int SPACE_BELOW_LOGO_PX = 50;

    private ImageButtonView peopleCount;

    public  SecondFragment(Activity mActivity){
        super(title, mActivity);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View result=inflater.inflate(R.layout.second_fragment_layout, container, false);
        peopleCount = new ImageButtonView(result, R.id.count_people_image, R.drawable.button_watch_2_selector);
        result.findViewById(R.id.count_people_image).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return result;
    }

    @Override
    public void onResume() {
        super.onResume();
        setSizeComponent();
    }

    private void setSizeComponent() {
        ImageView[] img = new ImageView[6];
        img[0] = (ImageView)getActivity().findViewById(R.id.restoran0);
        img[1] = (ImageView)getActivity().findViewById(R.id.restoran1);
        img[2] = (ImageView)getActivity().findViewById(R.id.restoran2);
        img[3] = (ImageView)getActivity().findViewById(R.id.restoran3);
        img[4] = (ImageView)getActivity().findViewById(R.id.restoran4);
        img[5] = (ImageView)getActivity().findViewById(R.id.restoran5);

        Display display = getActivity().getWindowManager().getDefaultDisplay();
        DisplayMetrics metricsB = new DisplayMetrics();
        display.getMetrics(metricsB);

        /**
         *для первого варианта размещения компонетов

        for(int i=0; i<img.length; i++) {
            img[i].setLayoutParams(new RelativeLayout.LayoutParams(metricsB.widthPixels / 3, metricsB.widthPixels / 3));
        }*/

        for(int i=0; i<img.length; i++) {
            img[i].setLayoutParams(new RelativeLayout.LayoutParams((int)(metricsB.widthPixels / 3* 0.95) , (int)(metricsB.widthPixels / 3*0.95)));
        }

        getActivity().findViewById(R.id.next_step_button).setLayoutParams(new RelativeLayout.LayoutParams(metricsB.widthPixels, SIZE_NEXT_STEP_PX_X));
        
        LinearLayout linearLayout = (LinearLayout)getActivity().findViewById(R.id.lineral_set_sum);
        linearLayout.setLayoutParams(new RelativeLayout.LayoutParams(metricsB.widthPixels, SIZE_INPUT_SUM_LAYOUT_PX_X));

        ImageView imgLogo = (ImageView)getActivity().findViewById(R.id.logo);
        imgLogo.setLayoutParams(new RelativeLayout.LayoutParams(metricsB.widthPixels, metricsB.heightPixels-(metricsB.widthPixels*2/3+SIZE_INPUT_SUM_LAYOUT_PX_X+SIZE_NEXT_STEP_PX_X+ MainActivity.ICON_SIZE*2+SPACE_BELOW_LOGO_PX)));


    }

}
