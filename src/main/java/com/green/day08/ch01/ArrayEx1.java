package com.green.day08.ch01;

public class ArrayEx1 {
    public static void main(String[] args) {
        // 5개의 방을 갖고있는 정수형 배열을 만들고 각 방의 1에서 부터 10까지의 랜덤한 값을 넣어보자

        int[] arr1 = new int[5];
        for(int i = 0; i < arr1.length; i++) {
            arr1[i] = (int)(Math.random() * 10) + 1;
            for(int j = 0; j < i; j++) {
                if(arr1[i] == arr1[j]) {
                    i--;
                    break;
                }
            }
        }

        for(int k = 0; k < 5; k++) {
            System.out.println(arr1[k]);
        }
    }
}
