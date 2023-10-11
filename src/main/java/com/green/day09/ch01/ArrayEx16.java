package com.green.day09.ch01;

import java.util.Scanner;

import java.util.Arrays;
public class ArrayEx16 {
    public static void main(String[] args) {
        // 3개의 스트링값을 담을수 있는 배열을 생성
        // 3번 문자열로 입력을 받는다
        // 입력받은 문자열들을 순차적으로 배열에 값을 갖는다
        // 값 넣는게 종료가 되면 향상된 for문으로 저장되어있는 값들을 콘솔에 출력할것

        Scanner s = new Scanner(System.in);

        final int G = 3;

        String[] sam = new String[3];

        for(int i = 0; i < G; i++) {
            sam[i] = s.nextLine();
        }

        for (String sa : sam) {
            System.out.println(sa);
        }
    }
}
