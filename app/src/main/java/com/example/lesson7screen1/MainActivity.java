package com.example.lesson7screen1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnScreen1;
    private Button btnScreen2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnScreen1 = (Button) findViewById(R.id.screen1);
        btnScreen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(v.getContext(), Screen1.class);
            startActivityForResult(intent, 0);
            }
        });
        btnScreen2 = (Button) findViewById(R.id.screen2);
        btnScreen2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Screen2.class);
                startActivityForResult(intent, 0);
            }
        });
    }
}
