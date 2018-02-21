package com.company.practice.filesystem;

import java.io.File;

public class FileExist {

    public static void main(String args[]) {

        File file = new File("/Users/cr2k/k5.docx");

            if (file.exists()) {
                System.out.println("Exist" + file);
            }
            else
                System.out.println(" not Exist" );
    }

}
