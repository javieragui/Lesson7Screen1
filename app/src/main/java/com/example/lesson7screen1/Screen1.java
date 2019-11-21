package com.example.lesson7screen1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Date;

public class Screen1 extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    private Button btnFecha;
    private Button btnSound ;
    private CheckBox checkBox;
    private TextView textViewCH;
    private RadioButton radioBlue;
    private RadioButton radioGreen;
    private RadioButton radioRed;
    private TextView radioText;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen1);

        btnFecha = (Button) findViewById(R.id.btnHorari);
        btnFecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnFecha.setText(new Date().toString());
                btnFecha.setBackgroundColor(Color.MAGENTA);
                btnFecha.setTextColor(Color.WHITE);
                btnFecha.setWidth(200);
            }
        });

        final MediaPlayer sound = MediaPlayer.create(this, R.raw.silbido);
        btnSound = (Button) findViewById(R.id.btnSound);
        btnSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.start();
            }
        });

        textViewCH = (TextView) findViewById(R.id.textViewCheck);
        checkBox = (CheckBox) findViewById(R.id.check);
        checkBox.setOnCheckedChangeListener(this);
        radioBlue = (RadioButton) findViewById(R.id.blue);
        radioBlue.setOnCheckedChangeListener(this);
        radioRed = (RadioButton) findViewById(R.id.red);
        radioRed.setOnCheckedChangeListener(this);
        radioGreen = (RadioButton) findViewById(R.id.green);
        radioGreen.setOnCheckedChangeListener(this);
        radioText = findViewById(R.id.textRadio);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(checkBox.isChecked()){
            textViewCH.setText("This checkbox is: Checked");
        }else{
            textViewCH.setText("This checkbox is: NO checked");
        }
        if(radioBlue.isChecked()){
            radioText.setBackgroundColor(Color.BLUE);
        }
        if(radioRed.isChecked()){
            radioText.setBackgroundColor(Color.RED);
        }
        if(radioGreen.isChecked()){
            radioText.setBackgroundColor(Color.GREEN);
        }
    }
}
