package com.green.day12.ch01;

import java.util.Arrays;
public class MethodEx3 {

    int[] plusMap(int[] arr, int n1) {
        int[] arr2 = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i] + n1;
        }

        return arr2;
    }

    void plusOrigin(int[] arr, int val) {

        for(int i = 0; i < arr.length; i++) {
            arr[i] += val;
        }
    }

    int[] randomValFromTo(int kugi, int min, int max) {
        int[] arr1 = new int[kugi];
        for(int i = 0; i < kugi; i++) {
            arr1[i] = (int)(Math.random() * (max - min + 1)) + min;
        }

        return arr1;
    }
    public static void main(String[] args) {
        MethodEx3 me = new MethodEx3();

        int[] arr = { 10, 20, 30 };
        int[] rArr1 = me.plusMap(arr, 2); // arr의 배열값이 +2인 상태에서 리턴할것
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(rArr1));

        me.plusOrigin(arr, 4);
        System.out.println(Arrays.toString(arr));

        int[] rArr2 = me.randomValFromTo(10, 5, 20); // 1) 배열크기 2) 랜덤 최소값 3) 랜덤 최대값
        System.out.println(Arrays.toString(rArr2));


    }
}
