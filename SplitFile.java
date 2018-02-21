package com.company.practice.filesystem;

import java.io.File;

public class SplitFile {

    public static void main(String args[]) {

        File file = new File("/Users/cr2k/Downloads");
        System.out.println(file.listFiles());
    }
}
