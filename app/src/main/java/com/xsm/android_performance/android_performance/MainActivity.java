package com.xsm.android_performance.android_performance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listview);
        initList();
        listView.setAdapter(adapter);
    }

    private void initList() {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            list.add(String.valueOf(i));
        }
        adapter = new ListAdapter(this, R.layout.list_item, list);
    }
}
