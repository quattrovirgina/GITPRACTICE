package com.green.day08.ch02;

import java.util.Arrays;
public class ArrayEx3 {
    public static void main(String[] args) {
        int[] score = { 100, 80, 100, 100, 90, 80 };

        // 총점 및 평균을 구현하자

        int total = 0;
        double average = 0;

        for(int i = 0; i < score.length; i++) {
            total += score[i];
        }

        System.out.printf("총점: %d", total);
        average = (double)total / score.length;

        System.out.printf("\n평균 : %.0f", average);
    }
 }
