package com.company.practice.filesystem;

import java.io.File;

public class SpecificFiles {

    public static void main(String args[]) {

        File file1 = new File("/Users/cr2k");
        File[] fList = file1.listFiles();
         for (File file : fList) {
             if (file.getName().endsWith(".docx")) {
                 System.out.println(file);
             }
         }

    }
}
