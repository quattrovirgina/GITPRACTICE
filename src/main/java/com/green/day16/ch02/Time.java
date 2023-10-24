package com.green.day16.ch02;

import com.green.day16.ch01.PackageTest;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        setHour(hour);
        this.minute = minute;
        this.second = second;
    }

   /*public toString() {
        if(hour < 10) {
            System.out.printf("%02d: %d: %d",hour, minute, second);
            if(minute < 10) {
                System.out.printf("%02d: %02d: %d", hour, minute, second);
            }
        }
    } */

    public void setHour(int hour) { // 0 ~ 23. 만약 23초과일 경우 23으로 출력하도록 하고 0 미만 값이라면 0이 들어가도록
        if(hour > 23) {
            this.hour = 23;
        }
        else if(hour < 0) {
            this.hour = 0;
        }
        else {
            this.hour = hour;
        }

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

        Time pa = new Time(2, 2, 30);

        System.out.println(pa);
    }
}
