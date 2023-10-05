package com.green.day07.ch02;

public class ArrayV2 {
    public static void main(String[] args) {
        int[] arr1 = { 100, 200 };
        int[] arr2 = { 5, 10, 15 };

        for(int i = 0; i < arr1.length; i++) {
            System.out.printf("arr1[%d] : %d \n", i, arr1[i]);
        }
        System.out.println("-----------------------------------------------");
        arr1 = arr2;

        for(int j = 0; j < arr1.length; j++) {
            System.out.printf("arr2[%d] : %d \n", j, arr1[j]);
        }
        System.out.println(arr2.length);

        System.out.println("-----------------------------------------------");
        arr1[1] = 44;
        arr2[2] = 55;

        for(int i = 0; i< arr1.length; i++) {
            System.out.printf("arr1[%d] : %d \n", i, arr1[i]);
        }
    }
}
