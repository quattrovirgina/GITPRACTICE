package com.green.day10.ch02;

public class NumberBoxTest {
    public static void main(String[] args) {
        NumberBox nb1; // nb1 = 참조변수(Reference 변수) NumberBox = 객체. 즉 NumberBox의 객체주소만 담을수 있는 변수이다.
        nb1 = new NumberBox();

        nb1.sum(10, 20);
        nb1.sum(40, 50);

        int i = 0;
        int j = 1;

        for(i = 0; i < 100; i++) {
            nb1.sum(i, j);
            j++;
        }

        nb1.minus(40, 20);

        for(i = 100; i > 1; i--) {
            nb1.minus(i, i-1);
        }


        nb1.abs(-10);
        nb1.abs(10);
        nb1.abs(-33);
    }
}
