package com.company.practice.basicexercise;

import java.util.Scanner;

public class Product {

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("First Number: ");
        a = sc.nextInt();
        System.out.print("Second Number: ");
        b = sc.nextInt();
        System.out.print("Product of two numbers: "+(a*b));

    }
}
