package com.green.day07.ch02;

public class ArrayV0 {
    public static void main(String[] args) {
        int [] x = {10, 20, 30, 40, 50, 60};

        for(int i = 0; i < 6; i++) {
            System.out.printf("%d ", x[i]);
        }
        int y = x.length;
        System.out.printf("%d \n", y);

        String[] z = {"A", "B", "C", "D", "E", "F", "G"};

        for(int w = 0; w < 7; w++) {
            System.out.println(z[w]);
        }

        int[] arr1 = new int[30];

    }
}