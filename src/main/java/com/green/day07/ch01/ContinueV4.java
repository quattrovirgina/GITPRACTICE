package com.green.day07.ch01;

public class ContinueV4 {
    public static void main(String[] args) {
        // 0 부터 10까지 반복(11번 반복)
        // 3의 배수는 (0포함) 출력이 되지 않도록

        int i = 0;

        for(i = 0; i < 11; i++){
            int modval = i % 3;
            if( modval % 3 == 0) {
                continue;
            }
            System.out.printf("\ni = %d \n", i);
        }
    }
}
