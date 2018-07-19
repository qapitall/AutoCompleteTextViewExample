package com.qapitall.auto.complete.text.view.example;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondPage extends AppCompatActivity {

    String incomingCountryName;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        Intent commenValue= getIntent();
        incomingCountryName = commenValue.getStringExtra("CountryName");
        textView=findViewById(R.id.textView);
        textView.setText(incomingCountryName);

        // we showed the layout of the incoming text
    }
}
