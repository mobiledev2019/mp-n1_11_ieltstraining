package com.example.thithu.main;

import android.content.Intent;
import android.os.Bundle;

import com.example.thithu.Service.MediaServiceAll;
import com.example.thithu.calendar.TimePickerActivity;
import com.google.android.material.navigation.NavigationView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.thithu.listening.ListeningMain.ListeningActivity;
import com.example.thithu.R;
import com.example.thithu.UIApp;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener, UIApp.IMainView {
    private MainPresenter mainPresenter;
    private DrawerLayout drawer;
    private ActionBarDrawerToggle toggle;
    private NavigationView navigationView;
    private Toolbar toolbar;
    private LinearLayout linearLayoutListening,linearLayoutSpeaking,linearLayoutReading,linearLayoutWriting;
    private ImageButton timePickerButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        init();
       // mainPresenter.setData();
        ProgressBar progressBar;


    }
    private void initView(){
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        linearLayoutListening = findViewById(R.id.line_listening);
        linearLayoutReading  = findViewById(R.id.line_reading);
        linearLayoutSpeaking = findViewById(R.id.line_speaking);
        linearLayoutWriting = findViewById(R.id.line_writing);
        timePickerButton = findViewById(R.id.time_picker_button);
        linearLayoutListening.setOnClickListener(this);
        linearLayoutReading.setOnClickListener(this);
        linearLayoutSpeaking.setOnClickListener(this);
        linearLayoutWriting.setOnClickListener(this);
        timePickerButton.setOnClickListener(this);
    }
    private void init(){
        setSupportActionBar(toolbar);
        mainPresenter = new MainPresenter(this);
    }

    @Override
    public void setData(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void startListeningActivity() {
        Intent intent = new Intent(MainActivity.this, ListeningActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }

    @Override
    public void starReadingActivity() {

    }

    @Override
    public void starWritingActivity() {

    }

    @Override
    public void starSpeakingActivity() {

            Intent intent = new Intent(this, MediaServiceAll.class);
            intent.setAction(MediaServiceAll.STARTMEDIASERVER_ACTION);
            startService(intent);


    }

    @Override
    public void startTimePicker() {
        Intent intent = new Intent(MainActivity.this, TimePickerActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.line_listening:
                mainPresenter.ListeningClick();
                break;
            case R.id.time_picker_button:
                mainPresenter.TimePickerButtonClick();
                break;
            case R.id.line_speaking:
                mainPresenter.SpeakingClick();
                break;
        }
    }
}
