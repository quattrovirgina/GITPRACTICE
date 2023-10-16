package com.green.day11.ch01;

public class StarPrint {
    void line(int n) {
        for(int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }

    void square(int n) {
        int i = 0;
        int j = 0;

        String k = "*";

        for(i = 0; i < n; i++) {
            for(j = 0; j < n; j++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }

    void border() {
        System.out.println();
        System.out.println("---------------------------");
    }

    void triangle(int n) {
        for(int i = 1; i <= n; i++) {
            line(i);
            System.out.println();
        }
    }

    String checkGenderByID(String n) {
        char[] ch = new char[n.length()];
        String g = " ";

        for(int i = 0; i < n.length(); i++) {
            ch[i] = n.charAt(i);
        }

        if(ch[8] == '2' || ch[8] == '4') {
            g = "남성";
        }

        else if(ch[8] == '1' || ch[8] == '3') {
            g = "여성";
        }

        else {
            g = "유효하지 않은 주민번호입니다";
        }

        return g;
    }

    int sumFromTo(int n1, int n2) {
        int su = 0;

        for(int i = n1; i <= n2; i++) {
            su += i;
        }

        return su;
    }
}
