package com.company.practice.basicexercise;

import java.util.Scanner;

public class SumOfIntegerDigits {

    public  static void main(String args[]) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer : ");
        num = sc.nextInt();
        System.out.print(" Sum of Digits: " + sumOfDigits(num));

    }
    private static int sumOfDigits(int n) {
        int sum = 0;
        while (n>0) {
            sum += n%10;
            n = n/10;
            System.out.print("\nSum " + sum);
            System.out.print(" n " + n);
        }

        return sum;
    }
}
