package com.company.practice.basicexercise;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String args[]) {
        int num,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number ");
        num = sc.nextInt();

        for( i=1; i<=10 ;i++){

            System.out.print(num + " * "+ i +" = "+ (num*i)+"\n");
        }
    }

}
