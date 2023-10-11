package com.green.day10.ch01;

import java.util.Scanner;
import java.util.Arrays;
public class MultiArrayEx04 {
    public static void main(String[] args) {
        String[][] words = {
                {"CHAIR", "의자"},
                {"COMPUTER", "컴퓨터"},
                {"INTEGER", "정수"}
        };

        // CHAIR의 뜻은? >> dmlkr -> 틀렸습니다. 정답은 의자입니다.
        Scanner s = new Scanner(System.in);
        int cnt = 0;
        System.out.println("------------------------------------");
        for(int i = 0; i < words.length; i++) {
            String[] kenyom = words[i];
            System.out.printf("Q%d. %s의 뜻은? >> ", i+1, kenyom[0]);
            String answer = s.nextLine();
            String expectedanswer = kenyom[1];

            if(answer.equals(expectedanswer)) {
                System.out.println("정답입니다");
                cnt++;
            }

            else {
                System.out.printf("오답입니다. 정답은 %s입니다. \n", expectedanswer);
                cnt--;
            }
            System.out.println("-----------------------------------");

        }

    }
}
