package com.green.day08.ch02;

public class ArrayEx4 {
    public static void main(String[] args) {
        int[] score = { 79, 88, 91, 33, 100, 55, 95, 200 };

        //score 안에서 min 값과 max값을 찾아서 출력하자.

        int max = score[0];
        int min = score[0];

        for(int i = 0; i < score.length; i++) {
            if(score[i] < min) {
                min = score[i];
            }

            else if(score[i] > max) {
                max = score[i];
            }

        }
        System.out.printf("최소: %d, 최대: %d ", min, max);
    }
}
