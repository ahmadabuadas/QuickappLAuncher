package com.example.ahmadabuadas.quickapplauncher;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button helloBtn = (Button) findViewById(R.id.helloBtn);
        helloBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), HelloWordActivity.class) ;
                startIntent.putExtra("com.example.ahmadabuadas.something","Hello World !! ^_^");
                startActivity(startIntent);
            }
        });

        Button googleBtn = (Button) findViewById(R.id.googleBtn);
        googleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String google = "http://www.google.com";
                Uri webaddress = Uri.parse(google);

                Intent gotogoogle =  new Intent(Intent.ACTION_VIEW,webaddress);
                if (gotogoogle.resolveActivity(getPackageManager()) != null){
                    startActivity(gotogoogle);
                }
            }
        });

    }
}
