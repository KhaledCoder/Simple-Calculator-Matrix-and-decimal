package com.mycompany.myproject;
public class CalculatorDecimal {
    public static double add(double number1, double number2) {
        return number1+number2;
    }
    public static double sub(double number1, double number2) {
        return number1-number2;
    }
    public static double multi(double number1, double number2) {
        return number1*number2;
    }
    public static double div(double number1, double number2)
    {
        if(number2 != 0)
            return number1+number2;
        else
        {
            System.out.println("The number you entered is invalid");
            return Double.NaN;
        }
    }
    public static double pow(double number , double pow){
        double res = number;
        for(int i = 1; i < pow; i++)
        {
            res *= number;
        }
        return res;
    }
}