package com.example.handler;

import android.os.Handler;
import android.os.Message;
import android.widget.Toast;

import androidx.annotation.NonNull;

public class MyHandler extends Handler {
    public static final int ANDROID = 1;
    public static final int JAVA = 2;

    @Override
    public void handleMessage(@NonNull Message msg) {
        switch (msg.what) {
            case ANDROID:
                Toast.makeText(HandlerActivity.getContext(), "android", Toast.LENGTH_SHORT).show();
            case JAVA:
                Toast.makeText(HandlerActivity.getContext(), "java", Toast.LENGTH_SHORT).show();
        }
    }
}
