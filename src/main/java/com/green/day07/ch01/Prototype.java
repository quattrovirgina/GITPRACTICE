package com.green.day07.ch01;

import java.util.Scanner;
public class Prototype {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i < 101; i++) {
            //3 6 9부터 짝
            if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9 || i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
                System.out.printf("i = %d 짝 \n", i);

                if(i == 33 || i == 36 || i == 39 || i == 63 || i == 93 || i == 69 || i == 96 || i == 66 || i == 99) {
                    System.out.printf("i = %d 짝짝 \n", i);
                }
            }

            else {
                System.out.printf("%d \n", i);
            }

        }
    }
}
