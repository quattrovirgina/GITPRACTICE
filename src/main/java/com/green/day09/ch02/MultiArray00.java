package com.green.day09.ch02;

public class MultiArray00 {
    public static void main(String[] args) {
        int[][] arr1 = {
                {100, 200}, // 0
                {300, 400}, // 1
                {500, 600} // 2
        };

        int[] intArr = arr1[0]; // intArr로 2행 고정
        System.out.println(intArr[1]); // arr1의 2행 1열 출력
        System.out.println(arr1[0].length); // arr1의 0번째 행에서의 배열길이
        System.out.println(arr1[1].length); // arr1의 1번째 행에서의 배열길이
        System.out.println(arr1.length);
    }
}
