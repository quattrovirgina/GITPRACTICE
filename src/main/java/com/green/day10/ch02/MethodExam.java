package com.green.day10.ch02;

public class MethodExam {

    void checkZero(int n) {
        if( n == 0 ) {
            System.out.println("0이 맞습니다");
        }
        else {
            System.out.println("0이 아닙니다");
        }
    }

    int randomnumber(int n1, int n2) {
        int n = (int)(Math.random() * ((n2 - n1) + 1)) + n1;
        return n;
    }

    void scoreResultPrint(int n) {

        if(n < 0 || n > 100) {
            System.out.println("잘못된 점수입니다");
            return;
        }

        if (n >= 90) {
            System.out.println("A학점 입니다");
        }

        else if(n > 79) {
            System.out.println("B학점 입니다");
        }

        else if( n > 69) {
            System.out.println("C학점 입니다");
        }

        else {
            System.out.println("D학점입니다");
        }
    }

    void scoreResultPrint2(int n) {
        do {
            if (n >= 90) {
                System.out.println("A학점 입니다");
                break;
            }

            else if(n > 79) {
                System.out.println("B학점 입니다");
                break;
            }

            else if( n > 69) {
                System.out.println("C학점 입니다");
                break;
            }

        } while(n < 0 || n > 100);
        System.out.println("잘못된 점수입니다");
    }
}

