package com.example.lenovo.stockdetail;

import android.os.AsyncTask;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class StockAsyncTask extends AsyncTask<String,Void,ArrayList<Stock>>{
onDownloadCompleteListener mListener;

    public void SetonDownloadCompleteListener (onDownloadCompleteListener Listener) {
         mListener=Listener;
    }

    @Override
    protected ArrayList<Stock> doInBackground(String... params) {
      String urlString=params[0];
        try{
            URL url=new URL(urlString);
            HttpURLConnection httpURLConnection=(HttpURLConnection)url.openConnection();
             httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            InputStream inputStream=httpURLConnection.getInputStream();
            Scanner s=new Scanner(inputStream);
            String str="";
            while (s.hasNext()){
                str+=s.nextLine();
            }
       return parseStock(str);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private ArrayList<Stock> parseStock(String str) {
    try {
        JSONObject stockJson=new JSONObject(str);
        JSONObject query=stockJson.getJSONObject("query");
    } catch (JSONException e) {
        e.printStackTrace();
    }
return null;
    }
}

interface onDownloadCompleteListener{
    public void onDownloadComplete(ArrayList<Stock> stockArrayList);
}