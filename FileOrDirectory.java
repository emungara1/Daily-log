package com.company.practice.filesystem;

import java.io.File;
import java.util.Date;

public class FileOrDirectory {

    public static void main(String args[]) {

        File file = new File("/Users/cr2k/k8.docx");

        if (file.isFile()) {
            System.out.println(file.getAbsolutePath() + " is file");
        }
        else {
            System.out.println(file.getAbsolutePath() + " is not file");
        }
        if (file.isDirectory()) {
            System.out.println(file.getAbsolutePath() + " is directory");
        }
        else
            System.out.println(file.getAbsolutePath() + " is not directory");
        System.out.println(new Date(file.lastModified()));
        System.out.println(file.length());
    }
}
