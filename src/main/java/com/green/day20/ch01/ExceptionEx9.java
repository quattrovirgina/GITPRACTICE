package com.green.day20.ch01;

import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
public class ExceptionEx9 {
    public static void main(String[] args) {
        try {
                Exception e = new Exception("일부러 에러 터뜨림");
                System.out.println("99999");
                throw e;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("---- 끝 ----");
    }
}
