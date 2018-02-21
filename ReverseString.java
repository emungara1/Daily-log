package com.company.practice.basicexercise;

import java.util.Scanner;

public class ReverseString {

    public static void main(String args[]) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("String:");
         s = sc.nextLine();
        System.out.print("Reverse of String:");
         for (int i = s.length() -1 ; i >= 0; i--) {
            System.out.print(s.charAt(i));
         }
    }
}
