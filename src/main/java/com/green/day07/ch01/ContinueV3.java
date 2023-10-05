package com.green.day07.ch01;

public class ContinueV3 {
    public static void main(String[] args) {
        // while을 사용,
        int sum = 0;
        int i = 0;

        // i값이 계속 증가가 되면서 sum에 중첩으로 더하기를 할것
        // sum값이 100초과가 되는 시점에 i값을 출력할것

        while(true) {
            sum += i;
            i++;
            System.out.println(i);
            System.out.println(i);
            System.out.println(sum);
            if(sum > 100) {
                System.out.printf("total: %d", i);
                break;
            }
        }
    }
}
