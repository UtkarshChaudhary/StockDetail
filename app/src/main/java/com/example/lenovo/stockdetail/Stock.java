package com.example.lenovo.stockdetail;

public class Stock {
    String symbol;
    long averageDailyVolume;
    float yearLow;
    float yearHigh;
    String name;

    public Stock(String symbol, long averageDailyVolume, float yearLow, float yearHigh,String name) {
        this.symbol = symbol;
        this.averageDailyVolume = averageDailyVolume;
        this.yearLow = yearLow;
        this.yearHigh = yearHigh;
        this.name = name;
    }
}
