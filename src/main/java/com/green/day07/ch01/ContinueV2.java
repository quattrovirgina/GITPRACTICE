package com.green.day07.ch01;

public class ContinueV2 {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            for(int j = 10; j < 15; j++) {
                if(i % 2 == 1 || j % 2 == 1) {
                    continue;
                }
                System.out.printf("i:%d - j = %d\n", i, j);
            }
        }
        System.out.println("---------------------------\n");

        def:
        for(int k = 0; k < 5; k++) {
            for(int l = 10; l < 15; l++) {
                if(l == 13) continue def;
                System.out.printf("k: %d - l: %d \n", k, l);
            }

        }
    }
}
