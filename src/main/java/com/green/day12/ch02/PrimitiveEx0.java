package com.green.day12.ch02;

class Data {
    int x;

}
public class PrimitiveEx0 {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.printf("main() : x = %d\n", d.x);
        Data d2 = new Data();

        d2.x = 100;
        System.out.printf("main() : d2.x = %d\n", d2.x);
        change(d2);
    }

    public static void change(int x) {
        x = 1000;
        System.out.printf("change() : x = %d\n", x);
    }

    public static void change(Data d) {
        d.x = 1000;
        System.out.printf("Change() : x = %d\n", d.x);
    }

}
