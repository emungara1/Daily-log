package com.company.practice.basicexercise;

import java.util.Scanner;

public class Swap {

    public static void main(String args[]) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        a = sc.nextInt();
        System.out.print("b = ");
        b = sc.nextInt();
        System.out.print("Before swap: a = "+ a +" ,b = " + b );
        c = a;
        a = b;
        b = c;
        System.out.print("\nAfter swap: a = "+ a +" ,b = " + b );
    }
}
