package com.green.day10.ch02;

public class Tv2 {
    public static void main(String[] args) {
        Tv tv1 = new Tv(); // tv1과 tv2에 주소값이 저장
        /* 타입이 다른 관계로 Tv tv3 = str는 안됨

         */
        // primitive type인 변수들만 default 값을 갖고있음
        // 대문자는 tv1과 tv2의 주소값을 저장
        tv1.channel = 10;
        tv1.power = false;
        tv1.color = "빨간색";

        Tv tv2 = new Tv(); // 개체 생성

        System.out.println("tv1.channel : " + tv1.channel);
        System.out.println("tv1.power : " + tv1.power);
        System.out.println("tv1.color : " + tv1.color);
        System.out.println("tv2.channel : " + tv2.channel);
        System.out.println("tv2.channel : " + tv2.color); // NULL: 주소값을 갖고있지 않음
        System.out.println("tv1 == tv2 >> " + (tv1 == tv2)); // 주소값이 다르기 때문에 false로 나옴
    }

}