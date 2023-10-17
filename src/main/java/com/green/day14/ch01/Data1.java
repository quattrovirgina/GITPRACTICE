package com.green.day14.ch01;

public class Data1 {
    int value; // 명시적 초기화. 절대 쓰지말것

    int value2;

    int value3;

    public Data1() {
        this(100, 200, 300);
    } // 기본생성자. 생성자는 리턴타입 없어야할것

    public Data1(int a) {
        value = a;
    }

    public Data1(int a, int b, int c) {
        value = a;
        value2 = b;
        value3 = c;
    }

    public void printyourself() {
        System.out.printf("value : %d, value2: %d, value3: %d\n", value, value2, value3);
    }
}

class ConstructionTest {
    public static void main(String[] args) {
        Data1 da = new Data1();
        da.printyourself();

        Data1 da2 = new Data1(10, 20, 30);
        da2.printyourself();
    }

}

