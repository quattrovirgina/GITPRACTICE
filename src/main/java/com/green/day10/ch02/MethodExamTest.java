package com.green.day10.ch02;

public class MethodExamTest {
    public static void main(String[] args) {
        MethodExam me = new MethodExam();

        me.checkZero(10); // 0이 아닙니다
        me.checkZero(9); // 0이 아닙니다
        me.checkZero(0); // 0이 맞습니다

        // 10 ~ 100 랜덤값 리턴

        int r3 = me.randomnumber(10, 100);
        int r4 = me.randomnumber(5, 9);

        System.out.println(r3);
        System.out.println(r4);

        me.scoreResultPrint(100);
        me.scoreResultPrint(70);
        me.scoreResultPrint2(-1);

        // 100~90: A, 89~80: B, 79~70: C, 69~:D, -1: 잘못된점수
    }
}
