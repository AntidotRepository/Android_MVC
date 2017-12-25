package com.example.ducept.androidmvc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tv_result = (TextView)findViewById(R.id.tv_result);
        tv_result.setText("Salut");
        tv_result.setTextSize(30);


    }
}
