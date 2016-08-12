package com.example.anand.myvoteapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Acer on 12-08-2016.
 */

public class ErrorScreen extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.error_activity);
        TextView textView = (TextView)findViewById(R.id.textView);
        Button backbutton = (Button)findViewById(R.id.goback);
        backbutton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent gotomain = new Intent(ErrorScreen.this,MainActivity.class);
                        startActivity(gotomain);
                    }
                }
        );
    }
}