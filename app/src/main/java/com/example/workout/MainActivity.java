package com.example.workout;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_main);

       /* VideoView videov = (VideoView) findViewById(R.id.videoView);
        String homeVideo = "android.resources//:com.example.workout/"+R.raw.wave;
        Uri uri = Uri.parse(homeVideo);
        videov.setVideoURI(uri);
        videov.start(); */
    }

    public void clickOpenButton (View b){
        Toast.makeText(this, "Alpha version 1.0", Toast.LENGTH_LONG).show();
        setContentView(R.layout.page_main);
    }

    public void clickMondayButton (View b){
        setContentView(R.layout.monday_main);
    }
    public void clickTuesdayButton (View b){
        setContentView(R.layout.tuesday_main);
    }
    public void clickWednesdayButton (View b){
        setContentView(R.layout.wednesday_main);
    }
    public void clickThursdayButton (View b){
        setContentView(R.layout.thursday_main);
    }
    public void clickFridayButton (View b){
        setContentView(R.layout.friday_main);
    }
    public void clickSaturdayButton (View b){
        setContentView(R.layout.monday_main);
    }
    public void clickSundayButton (View b){
        setContentView(R.layout.monday_main);
    }

    public void completeButton (View b){

        int green = Color.parseColor("#fad7ca");

        ((Button)b).setText("Complete!");
        b.setBackgroundColor(green);
        b.setEnabled(false);
        //   ((Button)findViewById(R.id.closeGripCurls)).setBackgroundColor(Color.GREEN);
    }

    public void clickBackButton (View b){
        setContentView(R.layout.page_main);
    }

    public void clickRefreshButton (View b){
        setContentView(R.layout.monday_main);
    }

}