package com.green.day11.ch01;

public class StarPrintTest {
    public static void main(String[] args) {
        StarPrint sp = new StarPrint();
        sp.line(4);
        sp.border();
        sp.square(4);
        sp.border();
        sp.triangle(5);
        sp.border();

        String gender = sp.checkGenderByID("011231-8617111");
        System.out.println(gender);
        sp.border();
        int sum = sp.sumFromTo(4, 10);
        int sum2 = sp.sumFromTo(10, 15);
        System.out.printf("총합은 %d", sum);
        sp.border();
        System.out.printf("총합은 %d", sum2);
        sp.border();


    }
}
