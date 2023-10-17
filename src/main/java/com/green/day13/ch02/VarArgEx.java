package com.green.day13.ch02;

public class VarArgEx {

    public static void sum(int... arr) {
        int result = 0;
        for(int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        sum(10, 20);

    }
}
