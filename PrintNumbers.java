package com.company.practice.basicexercise;

public class PrintNumbers {

    public static void main(String args[]) {
        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0) {
                System.out.print(i + " , ");
            }
        }
        System.out.print("\n ");
            for (int i = 1; i <= 100; i++) {
                if (i % 5 == 0) {
                    System.out.print(i + " , ");
                }
            }
        System.out.print("\n ");
        for (int i = 1; i <= 100; i++) {
            if (i%3 == 0 && i%5 == 0) {
                System.out.print(i +" , ");
            }
        }
    }
}
