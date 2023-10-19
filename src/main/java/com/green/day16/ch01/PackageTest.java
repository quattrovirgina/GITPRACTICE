package com.green.day16.ch01;

public class PackageTest {
    private int hour;
    private int minute;
    private int second;

    public PackageTest(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString() {
        return String.format("%d시 %d분 %d초", hour, minute, second);
    }

    public void setHour(int hour) {

    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}


class TimeTest {
    public static void main(String[] args) {

        PackageTest pa = new PackageTest(10, 20, 30);
        pa.setMinute(30);

        System.out.println(pa);
    }
}

// 1) 생성자 이용해서 private한 멤버필드(클래스)에 값을 넣는다
// 2) public이 붙은 메소드를 통해서 private한 멤버필드(클래스)에 값을 넣는다