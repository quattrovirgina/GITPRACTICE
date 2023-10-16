package com.green.day11.ch02;

class Data2 {
    int x;
    double y;
}
public class ReferenceReturnEx {
    public static void main(String[] args) {
        Data2 da = new Data2();
        da.x = 10;
        da.y = 100.5;

        Data2 dat = copy0bj(da);
        System.out.println("da.x == dat.x : " + (da.x == dat.x));
        System.out.println("da.y == dat.y : " + (da.y == dat.y));
        System.out.println("da == dat : " + (da == dat));
    }

    public static Data2 copy0bj(Data2 d) {
        Data2 de = new Data2();

        d.x = de.x;
        d.y = de.y;

        return de;
    }
}
