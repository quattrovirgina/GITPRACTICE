package com.green.day19.ch02;

import com.green.day16.ch01.PackageTest;

public class Exception3 {
    public void sum() {}
    public static void main(String[] args) {
        try {
            int[] arr = new int[10];
            arr[10] = 10;

        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            // 수학적인 예외가 발생했을때
            System.out.println("수학적 예외");
        } catch (NullPointerException n){
            // NULLPOINT 예외가 발생했을때
            System.out.println("널포인트 예외");

        }catch (Exception e) {
            // 모든 예외
            System.out.println("모든 예외");

        } finally {

            System.out.println("나가 임마");
        }
        System.out.println("끝났어 임마");
    }
}
