package com.green.day20.ch01;

public class ExceptionEx12 {
    public static void main(String[] args) {
        try {
            method2();
        } catch(Exception e) {
            System.out.println("메소드2에 예외 발생");
        }
    }
    static void method1() {
        int a = 10 / 0;
    }

    static void method2() throws Exception {
        int a = 10 / 0;
    }
}


