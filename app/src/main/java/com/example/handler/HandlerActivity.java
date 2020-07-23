package com.example.handler;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.example.handler.MyHandler.ANDROID;
import static com.example.handler.MyHandler.JAVA;

public class HandlerActivity extends AppCompatActivity {

    private MyHandlerThread myHandlerThread;
    private static Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler);

        context = getBaseContext();

        ButterKnife.bind(this);
        myHandlerThread = new MyHandlerThread();
        myHandlerThread.start();
    }

    @OnClick(R.id.button_android)
    void setAndroid() {
        sendMessageToHandler(ANDROID);
    }

    @OnClick(R.id.button_java)
    void setJava() {
        sendMessageToHandler(JAVA);
    }

    private void sendMessageToHandler(int value){
        Message message = new Message();
        message.what = value;
        myHandlerThread.handler.sendMessage(message);
    }

    public static Context getContext(){
        return context;
    }
}