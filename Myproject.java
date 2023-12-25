/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.myproject;

import java.util.Scanner;

/**
 *
 * @author New 1000 Meeza
 */
public class Myproject {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome, please enter available values to avoid closing the program and not completing it. Thank you");
        System.out.println("Matrix or decimal?");
        System.out.println("1- Matrix");
        System.out.println("2- decimal");
        System.out.print("Click on the track number you want [1/2]: ");
        int track = in.nextInt();
        if (track == 1) {
            System.out.println("___________Matrix___________");
            Matrix();
        } else if (track == 2) {
            System.out.println("___________Decimal__________");
            Decimal();
        } else {
            System.out.println("invalid value , please try again");
        }
    }

    public static Scanner scan() {
        return new Scanner(System.in);
    }

    public static int[][] GetMatrix(int row, int column) {
        Scanner in = scan();
        int[][] Matrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                Matrix[i][j] = in.nextInt();
            }
            System.out.println();
        }
        return Matrix;
    }

    public static void PrintMatrix(int Matrix[][]) {
        int row = Matrix.length;
        int column = Matrix[0].length;
        System.out.println("______Result______");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(Matrix[i][j]);
                if (j < column - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void Matrix() {
        Scanner in = scan();
        System.out.print("What is the type of operation? ['+' or '-' or '*']: ");
        char operation = in.next().charAt(0);
        if (operation == '+') {
            System.out.println("Note: the number of rows in the first determinant must be equal to the number of rows in the second determinant , as well as the number of columns and more determinant.");
            System.out.print("How many matrices do you want to add?: ");
            int counter = in.nextInt();
            System.out.print("row: ");
            int row = in.nextInt();
            System.out.print("column: ");
            int column = in.nextInt();
            System.out.println("______Matrix1______");
            int result[][] = new int[row][column];
            result = GetMatrix(row, column);
            for (int c = 1; c < counter; c++) {
                System.out.println("______" + "Matrix(" + (c + 1) + ")______");
                int Matrix[][] = GetMatrix(row, column);
                result = CalculatorMatrix.add(result, Matrix);
            }
            PrintMatrix(result);
            return;
        } else if (operation == '-') {
            System.out.println("Note: the number of rows in the first determinant must be equal to the number of rows in the second determinant , as well as the number of columns and more determinant.");
            System.out.print("How many matrices do you want to subtraction?: ");
            int counter = in.nextInt();
            System.out.print("row: ");
            int row = in.nextInt();
            System.out.print("column: ");
            int column = in.nextInt();
            System.out.println("______Matrix1______");
            int result[][] = new int[row][column];
            result = GetMatrix(row, column);
            for (int c = 1; c < counter; c++) {
                System.out.println("______" + "Matrix(" + (c + 1) + ")______");
                int Matrix[][] = GetMatrix(row, column);
                result = CalculatorMatrix.subtraction(result, Matrix);
            }
            PrintMatrix(result);
            return;
        } else if (operation == '*') {
            System.out.println("Note: To avoid error, when multiplying two matrices, the number of columns of the first matrix(column1) must be equal to the number of rows of the second matrix(row2). Thank you.");
            int row1, row2, column1, column2, counter = 0;
            do {
                System.out.print("Row matrix1: ");
                row1 = in.nextInt();
                System.out.print("Column matrix1: ");
                column1 = in.nextInt();
                System.out.print("Row matrix2: ");
                row2 = in.nextInt();
                System.out.print("Column matrix2: ");
                column2 = in.nextInt();
                if (column1 == row2) {
                    System.out.println("______Matrix(1)______");
                    int Matrix1[][] = GetMatrix(row1, column1);
                    System.out.println("______Matrix(2)______");
                    int Matrix2[][] = GetMatrix(row2, column2);
                    int Result[][] = CalculatorMatrix.multiply(Matrix1, Matrix2);
                    PrintMatrix(Result);
                    return;
                } else {
                    if (counter == 1) {
                        System.out.println("invalid value , please try again");
                        return;
                    }
                    System.out.println("Please follow the instructions(column1 = row2)");
                    counter++;
                }
            } while (counter < 2);
        } else {
            System.out.println("invalid value , please try again");
        }
    }

    public static void Decimal() {
        Scanner in = scan();
        char operation;
        System.out.print("What is the type of operation? ['+' or '-' or '*' or '/' or power'^']: ");
        operation = in.next().charAt(0);
        switch (operation) {
            case '+': {
                System.out.print("How many numbers do you want to add?: ");
                int counter = in.nextInt();
                System.out.print("Number1: ");
                double sum = in.nextDouble();
                for (int i = 2; i <= counter; i++) {
                    System.out.print("number " + i + ": ");
                    double number = in.nextDouble();
                    sum = CalculatorDecimal.add(sum, number);
                }
                System.out.println("result: " + sum);
                return;
            }
            case '-': {
                System.out.print("How many numbers do you want to subtraction?: ");
                int counter = in.nextInt();
                System.out.print("Number1: ");
                double sub = in.nextDouble();
                for (int i = 2; i <= counter; i++) {
                    System.out.print("number " + i + ":");
                    double number = in.nextDouble();
                    sub = CalculatorDecimal.sub(sub, number);
                }
                System.out.println("result: " + sub);
                return;
            }
            case '*': {
                System.out.print("How many numbers do you want to multiply?: ");
                int counter = in.nextInt();
                System.out.print("Number1: ");
                double multi = in.nextDouble();
                for (int i = 2; i <= counter; i++) {
                    System.out.print("number " + i + ": ");
                    double number = in.nextDouble();
                    multi = CalculatorDecimal.multi(multi, number);
                }
                System.out.println("result: " + multi);
                return;
            }
            case '/': {
                System.out.print("How many numbers do you want to divide?: ");
                int counter = in.nextInt();
                System.out.print("Number 1: ");
                double div = in.nextDouble();
                for (int i = 2; i <= counter; i++) {
                    System.out.print("number " + i + ": ");
                    double number = in.nextDouble();
                    if (number != 0) {
                        div = CalculatorDecimal.div(div, number);
                    } else {
                        System.out.println("invalid value , please try again");
                        return;
                    }
                }
                System.out.println("result: " + div);
                return;
            }
            case '^': {
                System.out.print("Enter the number: ");
                double number = in.nextDouble();
                System.out.print("power: ");
                int pow = in.nextInt();
                System.out.println("result: " + CalculatorDecimal.pow(number, pow));
                return;
            }
            default: {
                System.out.println("invalid value");
                return;
            }
        }
    }
}
