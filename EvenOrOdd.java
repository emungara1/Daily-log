package com.company.practice.basicexercise;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input value:");
        int s = sc.nextInt();
            if (s % 2 !=0) {
                System.out.println("Odd ---- 1");
            }else
                System.out.println("even ---- 0");
    }
}
