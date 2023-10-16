package com.green.day11.ch02;

public class DiffPriRef {
    public static void main(String[] args) {
        int num = 30;
        ChangeVal(num);
        System.out.println("num : " + num);
        ChangeVal(num);
        System.out.println("num : " + num);

        NumBox nb = new NumBox(); // NumBox에는 num이라는 속성을 갖고있다.(처음에는 0)
        NumBox2 nb2 = new NumBox2();
        NumBox3 nb3 = new NumBox3();
        System.out.println("(1)nb.num : " + nb.num); // nb 속의 num의 주소값을 출력(초기화 0)
        nb.num = 40;
        System.out.println("(2)nb.num : " + nb.num); // 주소값이 바뀐 num의 주소값을 출력(40)
        ChangeVal(nb3);

        System.out.println("(3)nb.num : " + nb3.num3);

    }

    public static void ChangeVal(int val) {
        System.out.println("changeval - NumBox");
        val = 20;
    }


    public static void ChangeVal(NumBox3 nb3) {
        // 새로운 객체생성으로 주소변경
        System.out.println("changeval - NumBox");
        nb3.num3 = 20;
        nb3 = new NumBox3();
    }
}

class NumBox {
    int num;
}

class NumBox2 {
    int num2;
}

class NumBox3 {
    int num3;
}