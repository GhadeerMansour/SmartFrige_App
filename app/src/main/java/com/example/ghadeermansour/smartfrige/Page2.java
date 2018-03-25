package com.example.ghadeermansour.smartfrige;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Timer;
import java.util.TimerTask;


public class Page2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

    }

    public void buclick(View view) {

        EditText textID=(EditText) findViewById(R.id.editText);

       Intent myintent = new Intent(this, Page3_List.class);
        Bundle b = new Bundle();
        b.putString("FridgeID",textID.getText().toString());
        myintent.putExtras(b);

        startActivity(myintent);

    }



}
