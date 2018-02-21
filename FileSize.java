package com.company.practice.basicexercise;

import java.io.File;

public class FileSize {

    public static void main(String args[]) {
        System.out.print("/Users/cr2k/ColorTestFile.docx: " + new File("ColorTestFile.docx").length() + "bytes");
    }
}
