package com.example.conners.guardtracker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Conners on 4/20/2016.
 */
public class DataScreen extends Activity {
TextView guard1Tos, guard1Visited, guard1Breaks, guard1Name, guard2Tos, guard2Visited, guard2Breaks, guard2Name, guard3Tos,
        guard3Visited, guard3Breaks, guard3Name, guard4Tos, guard4Visited, guard4Breaks, guard4Name, guard5Tos, guard5Visited,
        guard5Breaks, guard5Name, guard6Tos, guard6Visited, guard6Breaks, guard6Name, guard7Tos, guard7Visited, guard7Breaks,
        guard7Name, guard8Tos, guard8Visited, guard8Breaks, guard8Name, guard9Tos, guard9Visited, guard9Breaks, guard9Name,
        guard10Tos, guard10Visited, guard10Breaks, guard10Name, guard11Tos, guard11Visited, guard11Breaks, guard11Name;

    int[] tosData;
    int[] breakData;
    int[] visitedData;
    String [] nameData;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.data_screen);

        initializeTextViews();

        // bundle of data from main activity
        Bundle dataArrays = getIntent().getExtras();

        // set all data from bundles to their arrays
        tosData = dataArrays.getIntArray("ToSData");

        breakData = dataArrays.getIntArray("breakData");

        visitedData = dataArrays.getIntArray("spotsData");

        nameData = dataArrays.getStringArray("namesData");


        //set all data to their respective views
        setVisitedViews();
        setBreakViews();
        setNameViews();
        setToSViews();



        //testView.setText(value);

    }

    public void initializeTextViews(){

        //initialize all of the text views in the xml for use by java
        guard1Tos = (TextView) findViewById(R.id.g1TimeData);
        guard1Visited = (TextView) findViewById(R.id.g1VisitedData);
        guard1Name = (TextView) findViewById(R.id.g1NameData);
        guard1Breaks = (TextView) findViewById(R.id.g1BreakData);
        guard2Tos = (TextView) findViewById(R.id.g2TimeData);
        guard2Visited = (TextView) findViewById(R.id.g2VisitedData);
        guard2Name = (TextView) findViewById(R.id.g2NameData);
        guard2Breaks = (TextView) findViewById(R.id.g2BreakData);
        guard3Tos = (TextView) findViewById(R.id.g3TimeData);
        guard3Visited = (TextView) findViewById(R.id.g3VisitedData);
        guard3Name = (TextView) findViewById(R.id.g3NameData);
        guard3Breaks = (TextView) findViewById(R.id.g3BreakData);
        guard4Tos = (TextView) findViewById(R.id.g4TimeData);
        guard4Visited = (TextView) findViewById(R.id.g4VisitedData);
        guard4Name = (TextView) findViewById(R.id.g4NameData);
        guard4Breaks = (TextView) findViewById(R.id.g4BreakData);
        guard5Tos = (TextView) findViewById(R.id.g5TimeData);
        guard5Visited = (TextView) findViewById(R.id.g5VisitedData);
        guard5Name = (TextView) findViewById(R.id.g5NameData);
        guard5Breaks = (TextView) findViewById(R.id.g5BreakData);
        guard6Tos = (TextView) findViewById(R.id.g6TimeData);
        guard6Visited = (TextView) findViewById(R.id.g6VisitedData);
        guard6Name = (TextView) findViewById(R.id.g6NameData);
        guard6Breaks = (TextView) findViewById(R.id.g6BreakData);
        guard7Tos = (TextView) findViewById(R.id.g7TimeData);
        guard7Visited = (TextView) findViewById(R.id.g7VisitedData);
        guard7Name = (TextView) findViewById(R.id.g7NameData);
        guard7Breaks = (TextView) findViewById(R.id.g7BreakData);
        guard8Tos = (TextView) findViewById(R.id.g8TimeData);
        guard8Visited = (TextView) findViewById(R.id.g8VisitedData);
        guard8Name = (TextView) findViewById(R.id.g8NameData);
        guard8Breaks = (TextView) findViewById(R.id.g8BreakData);
        guard9Tos = (TextView) findViewById(R.id.g9TimeData);
        guard9Visited = (TextView) findViewById(R.id.g9VisitedData);
        guard9Name = (TextView) findViewById(R.id.g9NameData);
        guard9Breaks = (TextView) findViewById(R.id.g9BreakData);
        guard10Tos = (TextView) findViewById(R.id.g10TimeData);
        guard10Visited = (TextView) findViewById(R.id.g10VisitedData);
        guard10Name = (TextView) findViewById(R.id.g10NameData);
        guard10Breaks = (TextView) findViewById(R.id.g10BreakData);
        guard11Tos = (TextView) findViewById(R.id.g11TimeData);
        guard11Visited = (TextView) findViewById(R.id.g11VisitedData);
        guard11Name = (TextView) findViewById(R.id.g11NameData);
        guard11Breaks = (TextView) findViewById(R.id.g11BreakData);
    }

    //set all name text views
    public void setNameViews(){

        guard1Name.setText(nameData[0]);
        guard2Name.setText(nameData[1]);
        guard3Name.setText(nameData[2]);
        guard4Name.setText(nameData[3]);
        guard5Name.setText(nameData[4]);
        guard6Name.setText(nameData[5]);
        guard7Name.setText(nameData[6]);
        guard8Name.setText(nameData[7]);
        guard9Name.setText(nameData[8]);
        guard10Name.setText(nameData[9]);
        guard11Name.setText(nameData[10]);
    }

    //set all spot visited text views
    public void setVisitedViews(){

        guard1Visited.setText(visitedData[0]+"");
        guard2Visited.setText(visitedData[1]+"");
        guard3Visited.setText(visitedData[2]+"");
        guard4Visited.setText(visitedData[3]+"");
        guard5Visited.setText(visitedData[4]+"");
        guard6Visited.setText(visitedData[5]+"");
        guard7Visited.setText(visitedData[6]+"");
        guard8Visited.setText(visitedData[7]+"");
        guard9Visited.setText(visitedData[8]+"");
        guard10Visited.setText(visitedData[9]+"");
        guard11Visited.setText(visitedData[10]+"");
    }

    // set all time on spot text views
    public void setToSViews(){

        guard1Tos.setText(tosData[0]+"");
        guard2Tos.setText(tosData[1]+"");
        guard3Tos.setText(tosData[2]+"");
        guard4Tos.setText(tosData[3]+"");
        guard5Tos.setText(tosData[4]+"");
        guard6Tos.setText(tosData[5]+"");
        guard7Tos.setText(tosData[6]+"");
        guard8Tos.setText(tosData[7]+"");
        guard9Tos.setText(tosData[8]+"");
        guard10Tos.setText(tosData[9]+"");
        guard11Tos.setText(tosData[10]+"");

    }

    //set all break number text views
    public void setBreakViews(){

        guard1Breaks.setText(breakData[0]+"");
        guard2Breaks.setText(breakData[1]+"");
        guard3Breaks.setText(breakData[2]+"");
        guard4Breaks.setText(breakData[3]+"");
        guard5Breaks.setText(breakData[4]+"");
        guard6Breaks.setText(breakData[5]+"");
        guard7Breaks.setText(breakData[6]+"");
        guard8Breaks.setText(breakData[7]+"");
        guard9Breaks.setText(breakData[8]+"");
        guard10Breaks.setText(breakData[9]+"");
        guard11Breaks.setText(breakData[10]+"");
    }

}
