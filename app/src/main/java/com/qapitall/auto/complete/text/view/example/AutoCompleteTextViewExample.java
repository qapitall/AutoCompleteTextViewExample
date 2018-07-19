package com.qapitall.auto.complete.text.view.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import java.util.ArrayList;

public class AutoCompleteTextViewExample extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;
    ArrayAdapter<String> adapter;
    ArrayList<String> arrayList = new ArrayList<>();
    Button button;

    // We have identified the required components

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text_view_example);

        arrayList.add("Azerbaijan"); // we added elements to the list of suggestions
        arrayList.add("France");
        arrayList.add("Germany");
        arrayList.add("Great Britain");
        arrayList.add("Turkey");

        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.layout_auto_complete_list_view_custom_adapter, arrayList);
        /*
        * We have defined the adapter needed to use autoCompleteTextView
        *
        * ArrayAdapter<>(getApplicationContext() / this, R.layout.layout_auto_complete_list_view_custom_adapter,     arrayList);
        *                                                                   /\                                          /\
        *                                       change the text color of dropdown in an AutoCompleteTextView        suggestion list
        *                                       we have defined a layout for this if you do not want it, you
        *                                       can use R.id.support_simple_spinner_dropdown_item
        *

        * */

        autoCompleteTextView.setAdapter(adapter);// We have defined the adapter to autoCompleteTextView

        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selectedCountryName = autoCompleteTextView.getText().toString();
                Intent secondPage = new Intent(getApplicationContext(),SecondPage.class);
                secondPage.putExtra("CountryName",selectedCountryName);
                startActivity(secondPage);

                //entered the text sent to SecondPage
            }
        });

    }
}
