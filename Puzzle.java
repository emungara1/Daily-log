package com.company.practice.basicexercise;

public class Puzzle {

    public static void main (String args[]) {
        int count = 0;
      for (int i = 1 ; i <=4; i++) {
          for (int j =1 ; j<=4; j++) {
              for (int k =1 ; k <= 4; k++) {
                  if (i != j && j != k && k != i) {
                      System.out.print(i + " " +j+ " " +k+"\n");
                      count++;
                  }
              }
          }
      }
        System.out.print("count of numbers " +count);
    }
}
