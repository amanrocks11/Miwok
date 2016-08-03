package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> numbersEng = new ArrayList<String>();
        numbersEng.add("One");
        numbersEng.add("Two");
        numbersEng.add("Three");
        numbersEng.add("Four");
        numbersEng.add("Five");
        numbersEng.add("Six");
        numbersEng.add("Seven");
        numbersEng.add("Eight");
        numbersEng.add("Nine");
        numbersEng.add("Ten");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, numbersEng);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

    }
}
