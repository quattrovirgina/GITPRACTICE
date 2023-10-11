package com.green.day09.ch01;

import java.util.Arrays;

public class ArrayEx10 {

    public static void main(String[] args) {
        final int L = 10;
        int[] numarr = new int[L];
        int[] cntarr = new int[L];

        // numarr 각 방에 0~9사이의 랜덤값을 대입(중복 허용)
        // cntarr의 0번방은 0의 개수, 1번방은 1의 개수, 즉 count 값을 넣어 0~9의 개수를 출력하자
        // [4, 4, 4, 6, 5, 7, 9, 7, 5, 3] >> 1의개수: 0, 2의 개수: 0, ..., 4의 개수: 3, 5의 개수: 2

        for(int i = 0; i < numarr.length; i++) {
            numarr[i] = (int)(Math.random() * 9);

            if(numarr[i] == 0) {
                cntarr[0]++;
            }

            if(numarr[i] == 1) {
                cntarr[1]++;
            }

            if(numarr[i] == 2) {
                cntarr[2]++;
            }

            if(numarr[i] == 3) {
                cntarr[3]++;
            }

            if(numarr[i] == 4) {
                cntarr[4]++;
            }

            if(numarr[i] == 5) {
                cntarr[5]++;
            }

            if(numarr[i] == 6) {
                cntarr[6]++;
            }

            if(numarr[i] == 7) {
                cntarr[7]++;
            }

            if(numarr[i] == 8) {
                cntarr[8]++;

            }

            if(numarr[i] == 9) {
                cntarr[9]++;
            }
        }

        System.out.println(Arrays.toString(numarr));

        for(int k = 0; k < cntarr.length; k++) {
            System.out.printf("%d의 개수: %d \n", k, cntarr[k]);
        }


    }
}
