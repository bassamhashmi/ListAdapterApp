package com.example.listadapterapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    // list view data
    private String[] list_data = {"Lahore", "Karachi", "Islamabad", "Peshawar", "Quetta", "Bahawalpur", "Pattoki", "Gwadar"};

    // list view object
    ListView list_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // list view - xml connection with java
        list_view = findViewById(R.id.list_view);

        // creating adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list_data);

        // connect list_view with adapter
        list_view.setAdapter(adapter);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //Toast msg
        Toast.makeText(this, "This is simple list view", Toast.LENGTH_LONG).show();
    }
}