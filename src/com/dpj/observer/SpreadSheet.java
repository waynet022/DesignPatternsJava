package com.dpj.observer;

public class SpreadSheet implements Observer {
    @Override
    public void update() {
        System.out.println("spreadsheet got notified");
    }
}
