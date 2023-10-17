package com.green.day14.ch01;

public class Card3 {

    String pattern; // 카테고리(스페이드,다이아 등)
    String denomi; // 번호 및 영어

    void printmyself() {
        System.out.printf("%s (%s)\n", pattern, denomi);

    }

    public Card3(String a, String b) {

        pattern = a;
        denomi = b;




    }


}
