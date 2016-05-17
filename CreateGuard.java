package com.example.conners.guardtracker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Conners on 2/23/2016.
 */
public class CreateGuard extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.make_new_guard);


    }



    public void onCreateGuard(View view) {
    // intiallize edit text views and get names set to string variables
        EditText guard1 = (EditText) findViewById(R.id.guard1ET);
        String guard1Name = String.valueOf(guard1.getText());

        EditText guard2 = (EditText) findViewById(R.id.guard2ET);
        String guard2Name = String.valueOf(guard2.getText());

        EditText guard3 = (EditText) findViewById(R.id.guard3ET);
        String guard3Name = String.valueOf(guard3.getText());

        EditText guard4 = (EditText) findViewById(R.id.guard4ET);
        String guard4Name = String.valueOf(guard4.getText());

        EditText guard5 = (EditText) findViewById(R.id.guard5ET);
        String guard5Name = String.valueOf(guard5.getText());

        EditText guard6 = (EditText) findViewById(R.id.guard6ET);
        String guard6Name = String.valueOf(guard6.getText());

        EditText guard7 = (EditText) findViewById(R.id.guard7ET);
        String guard7Name = String.valueOf(guard7.getText());

        EditText guard8 = (EditText) findViewById(R.id.guard8ET);
        String guard8Name = String.valueOf(guard8.getText());

        EditText guard9 = (EditText) findViewById(R.id.guard9ET);
        String guard9Name = String.valueOf(guard9.getText());

        EditText guard10 = (EditText) findViewById(R.id.guard10ET);
        String guard10Name = String.valueOf(guard10.getText());

        EditText guard11 = (EditText) findViewById(R.id.guard11ET);
        String guard11Name = String.valueOf(guard11.getText());

        //intent to go back to the main activity
        Intent goToPoolMap = new Intent(this, MainActivity.class);

        //create a string array to store the guard names
        String[] guardNamesArray = new String[]{guard1Name, guard2Name, guard3Name, guard4Name,
                guard5Name, guard6Name, guard7Name, guard8Name, guard9Name, guard10Name, guard11Name};
        goToPoolMap.putExtra("GuardNamesArray",guardNamesArray);

        //set result and then go back to main map
        setResult(RESULT_OK, goToPoolMap);

        finish();
    }

    //cancel create screen
    public void onCancelCreate(View view) {
        finish();
    }

}
