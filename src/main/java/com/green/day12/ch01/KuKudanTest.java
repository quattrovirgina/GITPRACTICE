package com.green.day12.ch01;

public class KuKudanTest {

    void test(int n1, int n2) {
        int result = 0;
        int result2 = 0;
        for(int i = 1; i < 10; i++) {
            result = n1 * i;
            System.out.printf("%d X %d = %d \n", n1, i, result);
        }

        border();

        for(int j = 1; j < 10; j++) {
            result2 = n2 * j;
            System.out.printf("%d X %d = %d \n", n2, j, result2);
        }

        border();
    }

    void printFromTo(int n1, int n2, String n3) {
        int result = 0;

        for(int i = n1; i <= n2; i++) {
            for(int j = 1; j < 10; j++) {
                result = i * j;
                System.out.printf("%d X %d = %d \n", i, j, result);
            }
            System.out.println(n3);
        }
    }

    void border() {
        System.out.println();
        System.out.println("----------------------------------");
    }
}
