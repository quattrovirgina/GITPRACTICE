package com.green.day07.ch01;

public class PrototypeV2 {
    public static void main(String[] args) {

        for(int i = 1; i < 101; i++) {
            System.out.printf("i = %d\n", i);
            int  temp = i;

            while(temp > 0) {
                int modval = temp % 10;
                System.out.printf("modval = %d\n", modval);
                if(modval != 0 && modval % 3 == 0) {
                    System.out.print("짝");
                }
                temp /= 10;
                System.out.printf("\ntemp = %d \n", temp);
            }
            System.out.println();
        }
    }
}
