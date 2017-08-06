package com.example.lenovo.stockdetail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Stock> stockArrayList;
    ListView listView;
    ArrayAdapter<String> adapter;
    ArrayList<String> companyName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         stockArrayList=new ArrayList<>();
        listView=(ListView)findViewById(R.id.listView);
        companyName=new ArrayList<>();
        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,companyName);
         listView.setAdapter(adapter);
        fetchStockDetail();
    }

    private void fetchStockDetail() {
        String urlString="https://query.yahooapis.com/v1/public/yql?q=select+%2A+from+yahoo.finance.quotes+where+symbol+in+%28%22YHOO%22%2C%22AAPL%22%2C%22GOOG%22%2C%22MSFT%22%29&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys&callback";

    }
}
