package com.green.day09.ch02;

public class MultiArrayEx01 {
    public static void main(String[] args) {
        int[][] score = {
                { 101, 102, 103 },
                { 21, 22, 23 },
                { 31, 32, 33 },
                { 41, 42, 43 }
        };

        int sum = 0;

        // score[0][0] = 100, score[0][1] = 100
        // literal 사용금지, 0만 사용가능

        for(int i = 0; i < score.length; i++) { // columns
            for(int j = 0; j < score[0].length; j++) { // rows
                System.out.printf("score [%d][%d] = %d \n", i, j, score[i][j]);
                sum += score[i][j];
            }
        }
        System.out.printf("sum = %d \n", sum);

        // 향상된 for문으로 sum을 구하자

        int sumanother = 0;

        for(int[] arr : score) {
            for(int sumv2 : arr) {
                sumanother += sumv2;
            }
        }

        System.out.println(sumanother);
    }
}
