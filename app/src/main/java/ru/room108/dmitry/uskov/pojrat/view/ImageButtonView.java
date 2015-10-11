package ru.room108.dmitry.uskov.pojrat.view;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;

public class ImageButtonView{

    private View rootView;

    private int id;

    private int[] imageId;

    private ImageView img;

    private final int STATE_COUNT;

    private int state;

    public ImageButtonView(View rootView, int id, int[] imageId) {
        this.rootView = rootView;
        this.id = id;
        this.imageId = imageId;
        STATE_COUNT= imageId.length;
        state=0;
        img = (ImageView)rootView.findViewById(id);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextState();
            }
        });

        img.setImageResource(imageId[state]);
    }

    public ImageButtonView(View rootView, int id, int imageId) {
        this(rootView, id, new int[] {imageId});
    }

    private void nextState() {
        state=(++state%STATE_COUNT);
        img.setImageResource(imageId[state]);
    }

    public int getState(){
        return state;
    }
}
