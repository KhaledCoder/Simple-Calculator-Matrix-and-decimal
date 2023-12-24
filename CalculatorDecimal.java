/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myproject;

/**
 *
 * @author New 1000 Meeza
 */
public class CalculatorDecimal {
    
    public static double add(double num, double add) {
        return num+add;
    }

    public static double sub(double num, double sub) {
        return num-sub;
    }

    public static double multi(double multi, double num) {
        return multi*num;
    }

    public static double div(double num, double div) {
        return num/div;
    }

    public static double pow(double number, double pow) {
        double res = number;
        for (int i = 1; i < pow; i++) {
            res *= number;
        }
        return res;
    }
}
