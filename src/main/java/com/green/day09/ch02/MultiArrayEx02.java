package com.green.day09.ch02;

public class MultiArrayEx02 {
    public static void main(String[] args) {

        // score[][0] = 국어
        // score[][1] = 영어
        // score[][2] = 수학

        // 번호 국영수 총점 평균(ex. 1  101 102 103 306 102.x(실수 한자릿수까지))

        int[][] score = { // 4행 3열
                { 101, 102, 103 },
                { 21, 22, 23 },
                { 31, 32, 33 },
                { 41, 42, 43 }
        };

        int sum = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;

        int[] intArr1 = score[0];
        int[] intArr2 = score[1];
        int[] intArr3 = score[2];
        int[] intArr4 = score[3];

        for(int i = 0; i < score[0].length; i++) {
            sum += intArr1[i];
            sum2 += intArr2[i];
            sum3 += intArr3[i];
            sum4 += intArr4[i];
        }
        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum3);

        double average = (double)sum / 3;
        double average2 = (double)sum2 / 3;
        double average3 = (double)sum3 / 3;
        double average4 = (double)sum4 / 3;

        System.out.println("번호   국어   영어    수학   총점   평균");
        System.out.println("------------------------------------");

        System.out.printf("%d    %d   %d   %d   %d   %.1f \n", 1, intArr1[0], intArr1[1], intArr1[2], sum, average);
        System.out.printf("%d    %d   %d   %d   %d   %.1f \n", 2, intArr2[0], intArr2[1], intArr2[2], sum2, average);
        System.out.printf("%d    %d   %d   %d   %d   %.1f \n", 3, intArr3[0], intArr3[1], intArr3[2], sum3, average);
        System.out.printf("%d    %d   %d   %d   %d   %.1f \n", 4, intArr4[0], intArr4[1], intArr4[2], sum4, average);
        }
    }
