package com.green.day09.ch01;

import java.util.Arrays;

public class ArrayEx10V2 {

    public static void main(String[] args) {
        final int L = 10;
        int[] numarr = new int[L];
        int[] cntarr = new int[L];

        // numarr 각 방에 0~9사이의 랜덤값을 대입(중복 허용)
        // cntarr의 0번방은 0의 개수, 1번방은 1의 개수, 즉 count 값을 넣어 0~9의 개수를 출력하자
        // [4, 4, 4, 6, 5, 7, 9, 7, 5, 3] >> 1의개수: 0, 2의 개수: 0, ..., 4의 개수: 3, 5의 개수: 2

        for(int i = 0; i < numarr.length; i++) {
            numarr[i] = (int) (Math.random() * 9);

            for (int j = 0; j < numarr.length; j++) {
                if (numarr[i] == j) {
                    cntarr[j]++;
                }
            }
        }
        System.out.println(Arrays.toString(numarr));

        for(int k = 0; k < numarr.length; k++) {
            System.out.printf("%d의 개수: %d \n", k, cntarr[k]);
        }
    }
}

// for(int sa : numArr) {
