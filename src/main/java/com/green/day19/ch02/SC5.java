package com.green.day19.ch02;

import java.awt.color.ICC_ColorSpace;

public class SC5 {
    public static void main(String[] args) {
        Runnable2 run = new RunRobot();
        Runnable2 run2 = new Runnable2() {
            @Override
            public void run() {
                System.out.println("하하하");
            }
        }; // 익명클래스
    }
}

interface Runnable2 {
    void run();

}

class RunRobot implements Runnable2 {
    @Override
    public void run() {
        System.out.println("로봇이 달린다");
    }
}