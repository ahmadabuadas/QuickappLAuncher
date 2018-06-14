package com.example.ahmadabuadas.quickapplauncher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HelloWordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_word);
        if(getIntent().hasExtra("com.example.ahmadabuadas.something")){
            TextView tv = (TextView) findViewById(R.id.textView);
            String text =getIntent().getExtras().getString("com.example.ahmadabuadas.something");
            tv.setText(text);
        }
    }
}
