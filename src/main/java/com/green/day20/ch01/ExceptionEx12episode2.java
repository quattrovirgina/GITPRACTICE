package com.green.day20.ch01;

class ExceptionEx12episode2 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    static void method1() throws Exception {
        method2();
    }

    static void method2() throws Exception {
        int s = 10 / 0;
    }
}
