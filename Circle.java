package com.company.practice.basicexercise;

import java.util.Scanner;

public class Circle {
    public static void main(String args[]) {
        float radius;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        radius = sc.nextFloat();
        System.out.print("Diameter: "+ 2 * radius);
        System.out.print("Circle: "+ Math.PI * radius * radius);
        System.out.print("Circumference: "+ 2 * Math.PI * radius);

    }
}
