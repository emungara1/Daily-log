package com.company.practice.basicexercise;

import java.util.Scanner;

public class UpperCase {

    public static void main(String args[]) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input :");
        s = sc.nextLine();

        System.out.print(s.toUpperCase());
    }
}
