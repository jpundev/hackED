package com.example.myapplication;

import android.app.ListActivity;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class HistoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_history);

        // Create a list data which will be displayed in inner ListView.
        List<String> listData = new ArrayList<String>();

        //for loop adds PID list data




        // Create the ArrayAdapter use the item row layout and the list data.
        ArrayAdapter<String> listDataAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listData);

        // Set this adapter to inner ListView object.
        setListAdapter(listDataAdapter);
    }

    // When user click list item, this method will be invoked.
    @Override
    protected void onListItemClick(ListView listView, View v, int position, long id) {
        // Get the list data adapter.
        ListAdapter listAdapter = listView.getAdapter();
        // Get user selected item object.
        Object selectItemObj = listAdapter.getItem(position);
        String itemText = (String)selectItemObj;

        // Create an AlertDialog to show.
        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setMessage(itemText);
        alertDialog.show();
    }
}


