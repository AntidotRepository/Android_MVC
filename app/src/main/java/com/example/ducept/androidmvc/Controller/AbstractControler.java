package com.example.ducept.androidmvc.Controller;

import com.example.ducept.androidmvc.Model.AbstractModel;

import java.util.ArrayList;

/**
 * Created by ducept on 24/11/2017.
 */

public abstract class AbstractControler
{
    protected AbstractModel calc;
    protected String operator = "";
    protected String number = "";
    protected ArrayList<String> listOperator = new ArrayList<String>();

    public AbstractControler(AbstractModel cal)
    {
        this.calc = cal;

        // We define the operators list
        // To be sure they are correct
        this.listOperator.add("+");
        this.listOperator.add("-");
        this.listOperator.add("*");
        this.listOperator.add("/");
        this.listOperator.add("=");
    }

    // Define the operator
    public void setOperator(String ope)
    {
        this.operator = ope;
        control();
    }

    // Define the number
    public void setNumber(String number)
    {
        this.number = number;
        control();
    }

    // Clean
    public void reset()
    {
        this.calc.reset();
    }

    // Control method
    abstract void control();
}
