package com.green;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            double doubleVal = Math.random();

            System.out.println("val :" + doubleVal);

            int intVal = (int) (doubleVal * 10);
            System.out.println("intVal :" + intVal);

            int rVal = (int) (Math.random() * 20);
            System.out.println("rVal : " + rVal);
    }
}