package com.example.ghadeermansour.smartfrige;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Page3_List extends AppCompatActivity{

    ListView listView ;
    String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry",
            "WebOS","Ubuntu","Windows7","Max OS X"};

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3__list);


        TextView tetv=(TextView) findViewById(R.id.textView2);
        Bundle b = getIntent().getExtras();
        String id= b.getString("FridgeID");
        tetv.setText("Needs list for Fridge ID: "+id);


        EditText editText=(EditText) findViewById(R.id.EditText1);
        editText.setText("1 - yogurt\n" +
                "2- Laban\n" +
                "3- Caramel\n" +
                "4- Eggs\n" +
                "5. Juice");








    }


}
