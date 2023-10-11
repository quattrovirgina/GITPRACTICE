package com.green.day09.ch02;

public class MultiArrayEx02V3 {
    public static void main(String[] args) {
        int[][] score = { // 4행 3열
                {101, 102, 103},
                {21, 22, 23},
                {31, 32, 33},
                {41, 42, 43}
        };

        System.out.println(score.length+"행"); // 4(행)
        System.out.println(score[0].length+"열"); // 3(열)

        System.out.println("------------------------------------");
        int[] sumArr = new int[score.length]; // sumArr는 score.length(4)만큼의 int 배열을 선언한다.


        System.out.println("번호\t수학\t영어\t총점\t평균");
        System.out.println("------------------------------------");
        for(int i = 0; i < score.length; i++) {
            System.out.printf("%d", i+1); // score.length(4)만큼 번호를 "1번부터"출력
            int sum = 0; // sum을 0으로 초기화
            for(int z = 0; z < score[i].length; z++) { //score[i].length(3)만큼
                int val = score[i][z]; // i행에서의 z열 배열값을 변수 val에 저장. 그러니까 i = 0이면 0행의 z열값들을 저장할것
                sumArr[z] += val; // 4크기의 sumArr[z]에 val(i행에서의 z열값 모두)의 모든값을 합할것
                sum += val; // sum변수에는 0행에서 3행까지의 모든 열의 값의 총합을 합칠것.
                System.out.printf("\t%d ", val);
            }
            float average = (float)sum / score[i].length;
            System.out.printf("\t%d\t%.1f\n", sum, average);
        }




    }
}
