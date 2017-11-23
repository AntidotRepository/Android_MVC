package com.example.ducept.androidmvc.Model;

/**
 * Created by ducept on 23/11/2017.
 */

public interface Observable
{
    public void addObserver(Observer obs);
    public void removeObserver();
    public void notifyObserver(String str);
}
