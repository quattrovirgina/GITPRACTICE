package com.green.day08.ch02;

public class ArrayTostring {
    public static void main(String[] args) {
        int[] arr1 = { 5, 10, 7, 3 };
        System.out.print("[");
        for(int i = 0; i < 3; i++) {
            System.out.printf("%d, ", arr1[i]);
        }
        System.out.print("3");
        System.out.println("]");
    }
}
