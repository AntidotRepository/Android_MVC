package com.example.ducept.androidmvc.Controller;

import com.example.ducept.androidmvc.Model.AbstractModel;

/**
 * Created by ducept on 24/11/2017.
 */

public class CalculatorControler extends AbstractControler
{
    public CalculatorControler(AbstractModel cal)
    {
        super(cal);
    }

    public void control()
    {
        // We notify the model of an action if control is ok
        // ...

        // If the operator is in the list
        if(this.listOperator.contains(this.operator))
        {

            if(this.operator.equals("="))  // If the operator is "="
            {
                // We ask to the model to display the result
                this.calc.getResult();
            }
            else // Else, we give the operator to the model
            {
                this.calc.setOperator(this.operator);
            }
        }
        
        // If the number is ok
        if(this.number.matches("^[0-9.]+$"))
        {
            this.calc.setNumber(this.number);
        }

        this.operator = "";
        this.number = "";
    }
}
