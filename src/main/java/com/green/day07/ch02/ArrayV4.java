package com.green.day07.ch02;

public class ArrayV4 {
    public static void main(String[] args) {
        // 동의성: 주소값비교(equals), 동일성: == 비교
        //

        int[] arr1 = { 5, 10, 15 };

        //arr2 >> 길이가 4, arr1과 같은 방은 같은 값을 가지고 3번방은 20을 갖고 있는 배열을 만들것

        int[] arr2 = new int[4];

        for(int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
            System.out.println(arr2[i]);
        }
        arr2[3] = 20;
        System.out.println("-----------------------------------");
        for(int i = 0; i < arr2.length; i++) {
            System.out.printf("arr2[%d] = %d\n", i, arr2[i]);
        }
        System.out.println(arr2.length);

    }
}
