package com.green.day10.ch02;

public class NumberBox {

    void sum(int n1, int n2) {
        System.out.printf("%d + %d = %d\n", n1, n2, (n1 + n2));
    }

    void minus(int n1, int n2) {
        System.out.printf("%d - %d = %d\n", n1, n2, (n1 - n2));
    }

    void abs(int n1) {
        if(n1 < 0) {
            System.out.printf("%d ", n1 * (-1));
        }

        else {
            System.out.printf("%d ", n1);
        }
    }
}
