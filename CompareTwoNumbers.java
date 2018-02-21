package com.company.practice.basicexercise;

import java.util.Scanner;

public class CompareTwoNumbers {

    public static void main(String args[]) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("a =");
        a = sc.nextInt();
        System.out.print("b = ");
        b = sc.nextInt();
        if(a > b) {
            System.out.print(a + " > " + b);
        }
        if(a <= b) {
            System.out.printf("%d <= %d\n", a, b);
        }
        if (a != b) {
                System.out.print(a + " != " + b);
        }

    }
}
