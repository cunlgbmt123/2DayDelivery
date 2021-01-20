package com.example.a2daydelivery.customerfoodpanel;

import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

import androidx.annotation.NonNull;

public class Animation {
    private static final int ANIMATION_DURATION = 1000;
    private static boolean isAnimationStart;

    public static void translateAnimation(final ImageView viewAnimation, @NonNull final View startView, View endView,
                                          final android.view.animation.Animation.AnimationListener animationListener){
        startView.setDrawingCacheEnabled(true);
        Bitmap cache = startView.getDrawingCache();
        if(cache == null){
            return;
        }
        Bitmap bitmap = Bitmap.createBitmap(cache);
        startView.setDrawingCacheEnabled(false);

        viewAnimation.setImageBitmap(bitmap);

        float startViewWithCenter = endView.getWidth()/2;
        float startViewHeightCenter = endView.getHeight()/2;

        float endtViewWithCenter = endView.getWidth()*0.75f;
        float endViewHeightCenter = endView.getHeight()/2f;

        final int[] startPos = new int[2];
        endView.getLocationOnScreen(startPos);
        final int[] endPos = new int[2];
        endView.getLocationOnScreen(endPos);

        float fromX, toX,fromY,toY;
        fromX = startPos[0];
        toX = endPos[0] + endtViewWithCenter - startViewHeightCenter;
        fromY = startPos[1]-startViewHeightCenter;
        toY = endPos[1]-endViewHeightCenter+startViewHeightCenter;

        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setInterpolator(new AccelerateDecelerateInterpolator());

        int animationDuraion = 200;

        ScaleAnimation starScale = new ScaleAnimation(1.0f, 1.5f, 1.0f, 1.5f,startViewWithCenter,startViewHeightCenter);
        starScale.setDuration(animationDuraion);

        TranslateAnimation translateAnimation = new TranslateAnimation(fromX,toX ,fromY ,toY );
        translateAnimation.setStartOffset(animationDuraion);
        translateAnimation.setDuration(ANIMATION_DURATION);

        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f,toX,toY);
        scaleAnimation.setStartOffset(animationDuraion);
        scaleAnimation.setDuration(ANIMATION_DURATION);

        animationSet.addAnimation(starScale);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(scaleAnimation);

        if(isAnimationStart){
            viewAnimation.clearAnimation();
            if (animationListener != null){
                animationListener.onAnimationEnd(null);
            }
        }
        viewAnimation.startAnimation(animationSet);
        animationSet.setAnimationListener(new android.view.animation.Animation.AnimationListener() {
            @Override
            public void onAnimationStart(android.view.animation.Animation animation) {
                isAnimationStart = true;

                viewAnimation.setVisibility(View.VISIBLE);
                startView.setVisibility(View.VISIBLE);

                if (animationListener !=null){
                    animationListener.onAnimationStart(animation);
                }
            }

            @Override
            public void onAnimationEnd(android.view.animation.Animation animation) {
                viewAnimation.setVisibility(View.GONE);
                startView.setVisibility(View.VISIBLE);

                if(animationListener != null){
                    animationListener.onAnimationEnd(animation);
                }
                isAnimationStart = false;
            }

            @Override
            public void onAnimationRepeat(android.view.animation.Animation animation) {
                if (animationListener != null){
                    animationListener.onAnimationRepeat(animation);
                }
            }
        });

    }
}
