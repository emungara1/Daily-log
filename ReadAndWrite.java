package com.company.practice.filesystem;

import java.io.File;

public class ReadAndWrite {

    public static void main(String args[]) {

        File file = new File("/Users/cr2k/k8.docx");

        if (file.canRead()) {
            System.out.println(file.getAbsolutePath() + " can read");
        }
        else
            System.out.println(file.getAbsolutePath() + " can not read");
        if (file.canWrite()) {
            System.out.println(file.getAbsolutePath() + " can write");
        }
        else
            System.out.println(file.getAbsolutePath() + " can not write");
    }

}
