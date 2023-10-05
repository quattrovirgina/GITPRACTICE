package com.green.day07.ch01;

import java.util.Scanner;
public class ContinueV5 {
    public static void main(String[] args) {
        // (1) square (2) tri (3) log 원하는 메뉴(1~3)을 선택하자(종료: 0) >>
        // 이 내용이 계속 반복(0을 입력하기 전까지)

        Scanner s = new Scanner(System.in);

        int input;

        do {
            System.out.println("(1) SQUARE, (2) TRI, (3) LOG 원하는 메뉴(1~3)를 선택하자(종료: 0) >> ");
            input = s.nextInt();
            switch(input) {
                case 1:
                    System.out.println("선택하신 메뉴는 1번입니다");
                    break;
                case 2:
                    System.out.println("선택하신 메뉴는 2번입니다");
                    break;
                case 3:
                    System.out.println("선택하신 메뉴는 3번입니다");
                    break;

                case 0:
                    break;

                default:
                        System.out.println("장난치지마라");
                        break;
            }
        } while(input != 0);
        System.out.println("프로그램을 종료합니다");

    }
}
