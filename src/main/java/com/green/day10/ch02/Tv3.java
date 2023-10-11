package com.green.day10.ch02;

public class Tv3 {
    public static void main(String[] args) {
        Tv tv1 = new Tv();

        System.out.printf("tv1.channel : %d\n", tv1.channel);

        tv1.channelUp(); // 호출 메소드
        System.out.printf("tv1.channel : %d\n", tv1.channel);

        while(tv1.channel != 10) {
            tv1.channelUp();
        }
        System.out.printf("tv1.channel : %d\n", tv1.channel);

        do {
            tv1.channelUp();
            System.out.printf("tv1.channel : %d\n", tv1.channel);
        } while(tv1.channel != 30);
    }
}
