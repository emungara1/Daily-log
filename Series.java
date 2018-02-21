package com.company.practice.basicexercise;

import java.util.Scanner;

public class Series {

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input number ");
        int n = sc.nextInt();
        System.out.printf("%d + %d%d + %d%d%d\n" ,n,n,n,n,n,n);
    }
}
