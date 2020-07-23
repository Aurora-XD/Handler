package com.example.handler;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class HandlerActivity extends AppCompatActivity {

    private MyHandlerThread myHandlerThread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler);

        ButterKnife.bind(this);
        myHandlerThread = new MyHandlerThread();
        myHandlerThread.start();
    }

    @OnClick(R.id.button_android)
    void setAndroid() {
        myHandlerThread.handler.post(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(HandlerActivity.this, "android", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @OnClick(R.id.button_java)
    void setJava() {
        myHandlerThread.handler.post(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(HandlerActivity.this, "java", Toast.LENGTH_SHORT).show();
            }
        });

    }

}