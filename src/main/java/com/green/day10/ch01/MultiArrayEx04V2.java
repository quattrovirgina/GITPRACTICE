package com.green.day10.ch01;

import java.util.Scanner;
public class MultiArrayEx04V2 {
    public static void main(String[] args) {
        String[][] words = {
                {"CHAIR", "의자"},
                {"COMPUTER", "컴퓨터"},
                {"INTEGER", "정수"}
        };

        int i = 1;

        for(String[] wordaarr : words) {
            System.out.printf("Q%d. %s의 뜻은? >> ", i++, wordaarr[0]);
        }
    }
}
