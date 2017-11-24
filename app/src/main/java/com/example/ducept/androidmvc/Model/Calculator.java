package com.example.ducept.androidmvc.Model;
import com.example.ducept.androidmvc.Model.Observable;

/**
 * Created by ducept on 23/11/2017.
 */

public class Calculator extends AbstractModel
{
    // Define operator
    public void setOperator(String ope)
    {
        // Launch calculation
        calculate();

        // Store the operator
        this.operator = ope;

        // If operator isn't "="
        if(!ope.equals("="))
        {
            // We reinitialize operand
            this.operand = "";
        }
    }

    // Define the number
    public void setNumber(String result)
    {
        // We concatenate the number
        this.operand += result;
        // We update
        notifyObserver(this.operand);
    }

    // Force calculation
    public void getResult()
    {
        calculate();
    }

    // We re-init everything
    public void reset()
    {
        this.result = 0;
        this.operand = "0";
        this.operator = "";

        // Update
        notifyObserver(String.valueOf(this.result));
    }

    // Calculate
    public void calculate()
    {
        // If there is no operator, the result is typed
        if(this.operator.equals(""))
        {
            this.result = Double.parseDouble(this.operand);
        }
        else
        {
            // If the operand is not empty, we calculate with it
            if(!this.operator.equals(""))
            {
                if(this.operator.equals("+"))
                {
                    this.result += Double.parseDouble(this.operand);
                }
                if(this.operator.equals("-"))
                {
                    this.result -= Double.parseDouble(this.operand);
                }
                if(this.operator.equals("*"))
                {
                    this.result *= Double.parseDouble(this.operand);
                }
                if(this.operator.equals("/"))
                {
                    try
                    {
                        this.result /= Double.parseDouble(this.operand);
                    }
                    catch (ArithmeticException e)
                    {
                        this.result = 0;
                    }
                }
            }
        }
        this.operand = "";

        // We start updating
        notifyObserver(String.valueOf(this.result));
    }
}
