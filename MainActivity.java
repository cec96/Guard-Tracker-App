package com.example.conners.guardtracker;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class MainActivity extends AppCompatActivity {
    TextView slideSpot1, slideSpot2, slideSpot3, slideSpot4,
            spot1, spot2, spot3, spot4, spot5,
            break1, break2;

    LifeGuard guard1 = new LifeGuard(0, "Name not set",0,0,0);
    LifeGuard guard2 = new LifeGuard(0, "Name not set",0,0,0);
    LifeGuard guard3 = new LifeGuard(0, "Name not set",0,0,0);
    LifeGuard guard4 = new LifeGuard(0, "Name not set",0,0,0);
    LifeGuard guard5 = new LifeGuard(0, "Name not set",0,0,0);
    LifeGuard guard6 = new LifeGuard(0, "Name not set",0,0,0);
    LifeGuard guard7 = new LifeGuard(0, "Name not set",0,0,0);
    LifeGuard guard8 = new LifeGuard(0, "Name not set",0,0,0);
    LifeGuard guard9 = new LifeGuard(0, "Name not set",0,0,0);
    LifeGuard guard10 = new LifeGuard(0, "Name not set",0,0,0);
    LifeGuard guard11 = new LifeGuard(0, "Name not set",0,0,0);

    LifeGuard[] guardArray = new LifeGuard[] {guard1, guard2, guard3, guard4, guard5,
            guard6, guard7, guard8, guard9, guard10, guard11};

    Bundle dataArrays;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeTextViews();

        //creates the timer event that allows for rotation
        Timer guardTimer = new Timer();
        TimerTask twentyMinRotate = new TimerTask() {
            @Override
            public void run() {
                new RotateTask().execute();
            }
        };

        //schedules the interval for executing the rotation
        guardTimer.schedule(twentyMinRotate, 1, 1000 * 8);

    }

    //initialize guard location text views
    public void initializeTextViews() {

        slideSpot1 = (TextView) findViewById(R.id.slideSpot1);
        slideSpot2 = (TextView) findViewById(R.id.slideSpot2);
        slideSpot3 = (TextView) findViewById(R.id.slideSpot3);
        slideSpot4 = (TextView) findViewById(R.id.slideSpot4);
        spot1 = (TextView) findViewById(R.id.spot1);
        spot2 = (TextView) findViewById(R.id.spot2);
        spot3 = (TextView) findViewById(R.id.spot3);
        spot4 = (TextView) findViewById(R.id.spot4);
        spot5 = (TextView) findViewById(R.id.spot5);
        break1 = (TextView) findViewById(R.id.break1);
        break2 = (TextView) findViewById(R.id.break2);

    }

    //starts the adding guards name activity
    public void onAddGuardClick(View view) {
        Intent addGuardScreenIntent = new Intent(this, CreateGuard.class);

        final int result = 1;

        startActivityForResult(addGuardScreenIntent, result);
    }

    //executed when the create guard activity is finished
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode == RESULT_OK) {
            //get all of the string data sent from CreateGuard.java
            String[] myGuardNames = data.getStringArrayExtra("GuardNamesArray");

            //set the guard name data
            guard1.name = myGuardNames[0];
            guard2.name = myGuardNames[1];
            guard3.name = myGuardNames[2];
            guard4.name = myGuardNames[3];
            guard5.name = myGuardNames[4];
            guard6.name = myGuardNames[5];
            guard7.name = myGuardNames[6];
            guard8.name = myGuardNames[7];
            guard9.name = myGuardNames[8];
            guard10.name = myGuardNames[9];
            guard11.name = myGuardNames[10];

            //set position of the guards
            guard1.position = 1;
            guard2.position = 2;
            guard3.position = 3;
            guard4.position = 4;
            guard5.position = 5;
            guard6.position = 6;
            guard7.position = 7;
            guard8.position = 8;
            guard9.position = 9;
            guard10.position = 10;
            guard11.position = 11;


            //set text view values from the guard data
            spot1.setText(guard1.name);
            spot2.setText(guard2.name);
            spot3.setText(guard3.name);
            spot4.setText(guard4.name);
            spot5.setText(guard5.name);
            slideSpot1.setText(guard6.name);
            slideSpot2.setText(guard7.name);
            slideSpot3.setText(guard8.name);
            slideSpot4.setText(guard4.name);
            break1.setText(guard10.name);
            break2.setText(guard11.name);
        }


    }

    //when data button is clicked create arrays to hold guard data and start data screen activity

    public void onDataReport(View view) {
        Intent startDataScreen = new Intent(this, DataScreen.class);
        int timeOnStand1 = guard1.timeOnStand;
        int timeOnStand2 = guard2.timeOnStand;
        int timeOnStand3 = guard3.timeOnStand;
        int timeOnStand4 = guard4.timeOnStand;
        int timeOnStand5 = guard5.timeOnStand;
        int timeOnStand6 = guard6.timeOnStand;
        int timeOnStand7 = guard7.timeOnStand;
        int timeOnStand8 = guard8.timeOnStand;
        int timeOnStand9 = guard9.timeOnStand;
        int timeOnStand10 = guard10.timeOnStand;
        int timeOnStand11 = guard11.timeOnStand;
        int[] tosData = {timeOnStand1, timeOnStand2, timeOnStand3, timeOnStand4, timeOnStand5, timeOnStand6,
        timeOnStand7, timeOnStand8, timeOnStand9, timeOnStand10, timeOnStand11};

        //create number of breaks array
        int breaks1 = guard1.breaks;
        int breaks2 = guard2.breaks;
        int breaks3 = guard3.breaks;
        int breaks4 = guard4.breaks;
        int breaks5 = guard4.breaks;
        int breaks6 = guard6.breaks;
        int breaks7 = guard7.breaks;
        int breaks8 = guard8.breaks;
        int breaks9 = guard9.breaks;
        int breaks10 = guard10.breaks;
        int breaks11 = guard11.breaks;
        int[] numBreaksData ={breaks1, breaks2, breaks3, breaks4, breaks5, breaks6, breaks7, breaks8, breaks9,
        breaks10, breaks11};

        //create the num spots visited array
        int numSpots1 = guard1.visited;
        int numSpots2 = guard2.visited;
        int numSpots3 = guard3.visited;
        int numSpots4 = guard4.visited;
        int numSpots5 = guard5.visited;
        int numSpots6 = guard6.visited;
        int numSpots7 = guard7.visited;
        int numSpots8 = guard8.visited;
        int numSpots9 = guard9.visited;
        int numSpots10 = guard10.visited;
        int numSpots11 = guard11.visited;
        int[] numSpotsData = {numSpots1, numSpots2, numSpots3, numSpots4, numSpots5, numSpots6, numSpots7,
        numSpots8, numSpots9, numSpots10, numSpots11};

        //create name data array
        String nameTransfer1 = guard1.name;
        String nameTransfer2 = guard2.name;
        String nameTransfer3 = guard3.name;
        String nameTransfer4 = guard4.name;
        String nameTransfer5 = guard5.name;
        String nameTransfer6 = guard6.name;
        String nameTransfer7 = guard7.name;
        String nameTransfer8 = guard8.name;
        String nameTransfer9 = guard9.name;
        String nameTransfer10 = guard10.name;
        String nameTransfer11 = guard11.name;
        String[] nameData = {nameTransfer1,nameTransfer2, nameTransfer3, nameTransfer4, nameTransfer5,
        nameTransfer6, nameTransfer7, nameTransfer8, nameTransfer9, nameTransfer10, nameTransfer11};

        //set bundle for transfer to data screen activity
        dataArrays = new Bundle();

        // add all of the arrays to the bundle
        dataArrays.putIntArray("ToSData", tosData);
        dataArrays.putIntArray("spotsData",numSpotsData);
        dataArrays.putIntArray("breakData", numBreaksData);
        dataArrays.putStringArray("namesData", nameData);

        //add bundle to the intent and start data screen activity
        startDataScreen.putExtras(dataArrays);
        startActivity(startDataScreen);


    }

    //Creates a new thread from the main to allow for UI updates
    private class RotateTask extends AsyncTask<Object, Void, Void> {


        @Override
        protected Void doInBackground(Object[] params) {
            return null;
        }
        protected void onPostExecute(Void result){

            //if else statement in order to move the guard spots forward
            LifeGuard tempGuard;
            for (int i = 0; i < 11; i++) {
                tempGuard = guardArray[i];
                if(tempGuard.position == 1){
                    spot2.setText(tempGuard.name);
                    tempGuard.position = 2;
                    tempGuard.visited++;
                    tempGuard.timeOnStand += 20;
                }else if(tempGuard.position == 2){
                    spot3.setText(tempGuard.name);
                    tempGuard.position = 3;
                    tempGuard.visited++;
                    tempGuard.timeOnStand += 20;
                }else if(tempGuard.position==3){
                    spot4.setText(tempGuard.name);
                    tempGuard.position = 4;
                    tempGuard.visited++;
                    tempGuard.timeOnStand += 20;
                }else if(tempGuard.position==4){
                    spot5.setText(tempGuard.name);
                    tempGuard.position = 5;
                    tempGuard.visited++;
                    tempGuard.timeOnStand += 20;
                }else if(tempGuard.position==5){
                    break2.setText(tempGuard.name);
                    tempGuard.position = 11;
                    tempGuard.breaks++;
                    tempGuard.timeOnStand += 20;
                }else if(tempGuard.position==10){
                    spot1.setText(tempGuard.name);
                    tempGuard.position = 1;
                    tempGuard.visited++;
                }else if(tempGuard.position==11){
                    slideSpot1.setText(tempGuard.name);
                    tempGuard.position = 6;
                    tempGuard.visited++;
                }else if(tempGuard.position==6){
                    slideSpot2.setText(tempGuard.name);
                    tempGuard.position = 7;
                    tempGuard.visited++;
                    tempGuard.timeOnStand += 20;
                }else if(tempGuard.position==7){
                    slideSpot3.setText(tempGuard.name);
                    tempGuard.position = 8;
                    tempGuard.visited++;
                    tempGuard.timeOnStand += 20;
                }else if(tempGuard.position==8){
                    slideSpot4.setText(tempGuard.name);
                    tempGuard.position = 9;
                    tempGuard.visited++;
                    tempGuard.timeOnStand += 20;
                }else if(tempGuard.position==9){
                    break1.setText(tempGuard.name);
                    tempGuard.position = 10;
                    tempGuard.breaks++;
                    tempGuard.timeOnStand += 20;
                }
            }
        }
    }
}

