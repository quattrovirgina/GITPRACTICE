package com.green.day18.ch02;

import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseBall {
    public static void main(String[] args) {
        WBC wbc = new WBC(3);
        wbc.start();
    }
}

class WBC {
    private final int GC;
    private int[] gameNumbers;
    public WBC(int n1) {
        GC = n1;
        gameNumbers = new int[3];
    }
    public void start() {
        sRNND();
        GUI();

    }

    private void GUI() {
        Scanner sc = new Scanner(System.in);
        int[] uArr = new int[GC];
        for(int i = 0; i < GC; i++) {
            System.out.printf("%d 숫자를 입력하자", i + 1);
            uArr[i] = sc.nextInt();
        }

        boolean boo = CR(uArr); // checkresult
        sc.close();
    }

    public boolean CR(int[] uArr) {
        int strike = 0;
        int ball = 0;
        int out = 0;

        for (int i = 0; i < uArr.length; i++) {
            for (int j = 0; j < i; j++) {
                if(gameNumbers[i] == uArr[j]) {
                    if(i == j) {
                        strike++;
                    }
                    else if(i != j) {
                        ball++;
                    }
                }
            }

        }

        return false;

    }
    public void sRNND() {
        int n2 = 0;
        for(int i = 0; i < gameNumbers.length; i++) {
            n2 = (int)(Math.random() * 10);
            gameNumbers[i] = n2;
            for(int j = 0; j < i; j++) {
                if(gameNumbers[j] == gameNumbers[i]) {
                    i--;
                }
            }
        }
        System.out.println(Arrays.toString(gameNumbers));


    }

}
