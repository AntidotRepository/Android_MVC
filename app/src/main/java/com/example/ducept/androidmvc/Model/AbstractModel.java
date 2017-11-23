package com.example.ducept.androidmvc.Model;

import java.util.ArrayList;
import com.example.ducept.androidmvc.Model.Observable;
import com.example.ducept.androidmvc.Model.Observer;

/**
 * Created by ducept on 23/11/2017.
 */

public abstract class AbstractModel implements Observable
{
    protected  double result = 0;
    protected String operator = "";
    protected String operand = "";

    private ArrayList<Observer> listObserver = new ArrayList<Observer>();

    // Clear
    public abstract void reset();

    // Do calculation
    public abstract void calculate();

    // Force to display result
    public abstract void getResult();

    // Set operation operator
    public abstract void setOperator(String operator);

    // Define number to use for operation
    public abstract void setNumber(String number);

    // Implement observer pattern
    public void addObserver(Observer obs)
    {
        this.listObserver.add(obs);
    }

    public void notifyObserver(String str)
    {
        if(str.matches("^[0-9]+"))
        {
            str = str.substring(1, str.length());
        }
        for(Observer obs : listObserver)
        {
            obs.update(str);
        }
    }

    public void removeObserver()
    {
        listObserver = new ArrayList<Observer>();
    }
}
