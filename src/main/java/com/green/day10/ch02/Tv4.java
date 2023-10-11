package com.green.day10.ch02;

public class Tv4 {
    public static void main(String[] args) {
        Tv tv1 = new Tv(); // stack 영역에 저장. 다만 주소값이 Tv의 어느쪽에 위치해있는지는 OS만 알고있음.

        Tv tv2 = tv1;

        System.out.println("tv1 == tv2 >> "+ (tv1 == tv2));

        // 메소드는 리턴타입 메소드명 파라미터로 구성
    }
}
