package com.green.day09.ch01;

import java.util.Arrays;

public class ArrayEx9 {
    public static void main(String[] args) {
        int[] code = { -4, -1, 3, 6 , 11 };
        int[] arr = new int[10];

        // arr각 방에 code에 있는 값만 랜덤하게 넣어놓자.

        int val = 0;

        for(int i = 0; i < arr.length; i++) {
            val = (int)(Math.random() * code.length);

            arr[i] = code[val];
        }

        System.out.println(Arrays.toString(arr));
    }
}
