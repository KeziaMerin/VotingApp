package com.example.votingapp;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "Name ";
    public static final String EXTRA_MESSAGE2 = "id";



    // spinner  // textView

    Spinner sp;
    private Intent
            intent;

    public MainActivity() {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = findViewById(R.id.Choose_Candidate);


    }


    public void vote(View view){





        EditText editText = findViewById(R.id.name_txt);
        EditText editText1 = findViewById(R.id.id_txt);

        String message = editText.getText().toString();
        String message2 = editText1.getText().toString();
        CharSequence spSelectedItem = (CharSequence) sp.getSelectedItem();

        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra(EXTRA_MESSAGE2,message2);

        intent.putExtra("data_spinner_1", spSelectedItem.toString());

        startActivity(intent);
    }


    protected void onDestroy(){

        super.onDestroy();
        Log.d("Main activity", "onDestroy: 1");

    }

    protected void onPause(){
        super.onPause();
        Log.d("Main activity", "onPause: 1");

    }

    protected void onStart(){
        super.onStart();
        Log.d("Main activity", "onStart: 1");

    }

    protected void onStop(){

        super.onStop();
        Log.d("Main Activity", "onStop: 1");
    }

    protected void onRestart(){
        super.onRestart();

        Log.d("Main Activity", "onRestart: 1");
    }

    protected void onResume(){
        super.onResume();

        Log.d("Main Activity", "onResume:1 ");
    }



}
