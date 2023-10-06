package com.green.day08.ch02;

import java.util.Arrays;
public class ArrayEx2 {
    public static void main(String[] args) {
        int[] arr1 = { 5, 10, 7, 3, 11,10 };
        System.out.println(Arrays.toString(arr1));
        System.out.print("[");
        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            if(i != arr1[0]) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
