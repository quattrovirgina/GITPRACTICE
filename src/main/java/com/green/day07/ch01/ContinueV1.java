package com.green.day07.ch01;

public class ContinueV1 {
    public static void main(String[] args) {
        // break로 switch while에 락
        // continue는 continue 이하의 구문은 자르고 처음으로 돌아간다

        for(int i = 0; i < 10; i++) {

            if(i % 2 == 0) continue;
            System.out.println(i);
        }
    }
}
