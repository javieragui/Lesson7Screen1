package com.example.lesson7screen1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

public class Screen2 extends AppCompatActivity {
    private static final String[] items={"RadioGroups","RadioButtons","URL Demo","Overlap Buttons", "URL Demo","Scroll View"};
    private Button radiogp;
    private Button radiobtn;
    private Button urltbn;
    private Button overlapBtn;
    private Button url;
    private Button scrollBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        radiogp = findViewById(R.id.RadioGroups);
        radiogp.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent intent = new Intent(v.getContext(), RadioGroups.class);
                   startActivityForResult(intent, 0);
               }
           }
        );
        radiobtn = findViewById(R.id.RadioButtons);
        radiobtn.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent intent = new Intent(v.getContext(), Radio_Buttons.class);
                   startActivityForResult(intent, 0);
               }
           }
        );
        urltbn = findViewById(R.id.URLDemo);
        urltbn.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent intent = new Intent(v.getContext(), URL.class);
                   startActivityForResult(intent, 0);
               }
           }
        );
        overlapBtn = findViewById(R.id.overlap);
        overlapBtn.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent intent = new Intent(v.getContext(), Overlap.class);
                   startActivityForResult(intent, 0);
               }
           }
        );
        url = findViewById(R.id.URL);
        url.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent intent = new Intent(v.getContext(), URL.class);
                   startActivityForResult(intent, 0);
               }
           }
        );
        scrollBtn = findViewById(R.id.scroll);
        scrollBtn.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent intent = new Intent(v.getContext(), ScrollWork.class);
                   startActivityForResult(intent, 0);
               }
           }
        );
    }

}
