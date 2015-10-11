package ru.room108.dmitry.uskov.pojrat.animation;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import ru.room108.dmitry.uskov.pojrat.R;

public class FallingAnimation {

    private final int maxCountItemsOnDisplayint;

    private int duration;

    private int[] imageId;

    private int respounTime;

    private Activity mActivity;

    private Rect mDisplaySize = new Rect();

    private float mScale;

    private RelativeLayout mRootLayout;

    private int countItemsOnDisplay;

    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);

            if(countItemsOnDisplay>=maxCountItemsOnDisplayint) return;

            int viewId = new Random().nextInt(imageId.length);
            Drawable d = mActivity.getResources().getDrawable(imageId[viewId]);
            LayoutInflater inflate = LayoutInflater.from(mActivity);
            ImageView imageView = (ImageView) inflate.inflate(R.layout.ani_image_view, null);
            imageView.setImageDrawable(d);
            mRootLayout.addView(imageView);
            Log.i("ChildCount", String.valueOf(mRootLayout.getChildCount()));

            RelativeLayout.LayoutParams animationLayout = (RelativeLayout.LayoutParams) imageView.getLayoutParams();

            animationLayout.setMargins(0, (int) (-150 * mScale), 0, 0);
            animationLayout.width = (int) (60 * mScale);
            animationLayout.height = (int) (60 * mScale);

            countItemsOnDisplay++;
            startAnimation(imageView);
        }
    };

    public FallingAnimation(Activity mActivity, int rootLayoutId , int duration, int respounTime, int maxCountItemsOnDisplayint, int[] imageId) {
        this.mActivity=mActivity;
        this.duration = duration;
        this.imageId = imageId;
        this.respounTime = respounTime;
        this.maxCountItemsOnDisplayint = maxCountItemsOnDisplayint;

        countItemsOnDisplay=0;


        Display display = mActivity.getWindowManager().getDefaultDisplay();
        display.getRectSize(mDisplaySize);

        DisplayMetrics metrics = new DisplayMetrics();
        display.getMetrics(metrics);
        mScale = metrics.density;
        mRootLayout = (RelativeLayout)mActivity.findViewById(rootLayoutId);
    }


    private void startAnimation(final ImageView aniView) {

        aniView.setPivotX(aniView.getWidth()/2);
        aniView.setPivotY(aniView.getHeight()/2);

        long delay = new Random().nextInt(respounTime/2);

        final ValueAnimator animator = ValueAnimator.ofFloat(0, 1);
        animator.setDuration(duration);
        animator.setInterpolator(new AccelerateInterpolator());
        animator.setStartDelay(delay);

        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            int angle = 50 + (int) (Math.random() * 101);
            int movex = new Random().nextInt(mDisplaySize.right);

            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                float value = ((Float) (animation.getAnimatedValue())).floatValue();
                if (value == 1.0) {
                    mRootLayout.removeView(aniView);
                    countItemsOnDisplay--;
                } else {
                    Log.i("value", String.valueOf(value));
                    aniView.setRotation(angle * value);
                    aniView.setTranslationX(movex);
                    aniView.setTranslationY((mDisplaySize.bottom + (250 * mScale)) * value);
                    Log.i("mDisplaySize.bottom", "mDisplaySize.bottom/2 = " + String.valueOf(mDisplaySize.bottom / 2));
                    //aniView.setTranslationY(mDisplaySize.bottom/2);
                }
            }
        });

        animator.start();
    }

    public void start() {
        new Timer().schedule(new TimerTask(){
            @Override
            public void run() {
                // we don't really use the message 'what' but we have to specify something.
                mHandler.sendEmptyMessage(0x001); //EMPTY_MESSAGE_WHAT
            }
        }, 0, respounTime/2);
    }

}

