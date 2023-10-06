package com.green.day08.ch01;

public class ArrayEx1V2 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int i = 0;
        int j = 0;

        while(i != 5) {

            arr1[i] = (int)(Math.random() * 10) + 1;
            for(j = 0; j < i; j++) {
                if(arr1[i] == arr1[j]) {
                    i--;
                    break;
                }
            }
            i++;

        }

        for(int k = 0; k < arr1.length; k++) {
            System.out.println(arr1[k]);
        }
     }
}
