package com.example.handler;

import android.os.Handler;
import android.os.Looper;

public class MyHandlerThread extends Thread {

    public Handler handler;

    @Override
    public void run() {
        Looper.prepare();
        handler = new MyHandler();
        Looper.loop();
    }
}
