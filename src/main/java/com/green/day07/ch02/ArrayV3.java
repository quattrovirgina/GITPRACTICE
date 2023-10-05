package com.green.day07.ch02;

public class ArrayV3 {
    public static void main(String[] args) {
        int[] arr1 = { 5, 10, 15, 20 };
        int[] arr2 = new int[arr1.length];

        for(int i = 0; i < arr2.length; i++) {
            System.out.printf("arr2[%d] : %d\n", i, arr2[i]);
        }
        System.out.println("----------------------------------------");
        for(int j = 0; j < arr1.length; j++) {
            arr2[j] = arr1[j];
            System.out.printf("arr2[%d] : %d\n", j, arr2[j]);
        }
        System.out.println("----------------------------------------");
        arr2[1] = 200;
        for(int k = 0; k < arr2.length; k++) {
            System.out.printf("arr2[%d] : %d\n", k, arr2[k]);
        }
    }
}
