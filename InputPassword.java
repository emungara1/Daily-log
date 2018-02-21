package com.company.practice.basicexercise;

import java.io.Console;
import java.util.Scanner;

public class InputPassword {
    public static void main (String args[]) {
        char[] password;
        Console cons = System.console();
        if(cons != null) {
            password = cons.readPassword("Input Password:");
            System.out.print(" Password was: " + new String(password));
        }else
            System.out.print("can't get password");
    }
}
