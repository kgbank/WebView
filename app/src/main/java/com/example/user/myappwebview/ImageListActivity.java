package com.example.user.myappwebview;

import android.app.Activity;
import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class ImageListActivity extends ListActivity {

    static final String[] arr = new String[]{
            "donut", "eclair", "froyo", "gingerbread", "honeycomb", "icecream", "jellybean"
    };

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        String selectedValue = (String) getListAdapter().getItem(position);
        Toast.makeText(this, selectedValue, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_list);
        setListAdapter(new ArrAdapter(this, arr));
    }
}
