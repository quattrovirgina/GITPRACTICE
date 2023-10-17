package com.green.day13.ch02;

public class MyMathTest {
    public static void main(String[] args) {
        MyMath ma = new MyMath();
        ma.num = 10;
        ma.staticNumber = 30;

        MyMath mat = new MyMath();

        mat.num = 100;
        mat.staticNumber = 50;

        System.out.printf("ma.num = %d\n", ma.num);
        System.out.printf("mat.num = %d\n", mat.num);
        System.out.printf("ma.num = %d\n", ma.staticNumber);
        System.out.printf("mat.num = %d\n", mat.staticNumber); // staticNumber는 공간이 하나
    }
}
