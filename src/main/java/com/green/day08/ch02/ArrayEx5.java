package com.green.day08.ch02;

import java.util.Scanner;
import java.util.Arrays;
public class ArrayEx5 {
    public static void main(String[] args) {
        // 1) 정수 10개를 저장할수 있는 배열을 만들자
        // 2) 0번부터 9번까지의 값을 순차적으로 대입하자.

        int[] ar = new int[10];

        int i = 0;
        Scanner s = new Scanner(System.in);

        for(i = 0; i < ar.length; i++) {
            ar[i] = i;
        }

        for(i = 0; i < ar.length; i++) {
            System.out.printf("%d번: %d \n", i, ar[i]);
        }
        System.out.println("---------------------------------------------");
        int j = 0;
        int val = 0;
        int temp = 0;
        for(j = 0; j < ar.length; j++) {

            val = (int)(Math.random() * 10);

            temp = ar[j];
            ar[j] = ar[val];
            ar[val] = temp;
        }

        System.out.println(Arrays.toString(ar));
    }
}
