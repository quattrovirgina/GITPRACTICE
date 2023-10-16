package com.green.day11.ch02;

import java.util.Arrays;
public class ReferanceParem0 {
    public static void main(String[] args) {
        int[] x = { 10 };
        System.out.printf("main() : x = %d\n", x[0]);

        System.out.printf("2 main() : x = %d\n", x[0]);
        int[] arr = { 3, 2, 1, 6, 5, 4 };
        printArr(arr);
        System.out.println();
        sortArrr(arr);
        System.out.println("sum = " + sumArr(arr));
    }

    public static void sortArrr(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            for(int j = 0; j < arr.length - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    swapping(arr, j, j+1);
                }
            }
        }

        System.out.print(Arrays.toString(arr));

    }

    public static void swapping(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void printArr(int[] arr) {
        System.out.print("[");
        for(int i = 0; i < arr.length-1; i++) {
            System.out.printf("%d, ", arr[i]);
        }
        System.out.printf("%d]", arr[arr.length-1]);
    }

    public static int sumArr(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }


}



