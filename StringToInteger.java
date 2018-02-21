package com.company.practice.basicexercise;

import java.util.Scanner;

public class StringToInteger {

    public static void main(String args[]) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input :");
        s = sc.next();
        System.out.print("Integer value " + Integer.parseInt(s));
    }
}
