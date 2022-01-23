package com.example.betaapp;

import android.view.SurfaceHolder;

public class GameView extends SurfaceView implements SurfaceHolder.Callback {

    public GameView(MainActivity context) {
        super(context);

        getHolder().addCallback(this);
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height)

    }

    @Override
    public void surfaceCreated(SurfaceHolder holder)
}

