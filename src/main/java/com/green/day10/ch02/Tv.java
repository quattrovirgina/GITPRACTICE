package com.green.day10.ch02;

public class Tv {
    String color;
    boolean power;
    int channel;

    void power() { // 리턴타입(void), 메소드명(power), 파라미터(())
        power = !power;
    }

    void channelUp() { // 선언부(무조건 필수)
        channel++; // 구현부
    }

    void channelDown() { // 정의 메소드
        channel--;
    }

}
