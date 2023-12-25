package com.mycompany.myproject;

public class CalculatorDecimal {

    public static double add(double num, double add) {
        return num + add;
    }

    public static double sub(double num, double sub) {
        return num - sub;
    }

    public static double multi(double multi, double num) {
        return multi * num;
    }

    public static double div(double num, double div) {
        return num / div;
    }

    public static double pow(double number, double pow) {
        double res = number;
        for (int i = 1; i < pow; i++) {
            res *= number;
        }
        return res;
    }

    public static double square(double num) {
        double result = Math.sqrt(num);
        return result;
    }

    public static double fact(int num) {
        int sum = 1;
        {
            for (int i = 1; i <= num; i++) {
                sum *= i;
            }
        }
        return sum;
    }

    public static double cos(double num) {
        double b = Math.toRadians(num);
        double sum = Math.cos(b);
        return sum;
    }

    public static double sin(double num) {
        double b = Math.toRadians(num);
        double sum = Math.sin(b);
        return sum;
    }

    public static double tan(double num) {
        double b = Math.toRadians(num);
        double sum = Math.tan(b);
        return sum;
    }
}
