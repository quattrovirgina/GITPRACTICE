package com.green.day19.ch02;

public class Exception1 {
    public static void main(String[] args) {
        int num = 0;

        try {
            // 예외가 발생할 가능성이 있는 문장들을 넣을것
            num = 10;
            num = num / 0;
        } catch (Exception e) {
            // Exception이 발생시 이를 처리하기 위한 문장을 적을것
            // e.printStackTrace(); 어떤 예외가 발생하였는지 출력
            System.out.println("예외 발생!");
            num = -1;
        } finally {
            // Exception이 실행이 되든 안되는 반드시 넣어야할것. 무조건 실행
            System.out.println("FINALLY 실행!");
        }
        System.out.printf("num: %d\n", num);
        System.out.println("-----끝-----");
    }
}
