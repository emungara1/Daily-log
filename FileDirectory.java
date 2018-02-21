package com.company.practice.filesystem;

import java.io.File;

public class FileDirectory {

    public static void main(String args[]) {

        File file = new File("/Users/cr2k/workspace-sm");
        for(String name : file.list()) {
           // System.out.println(name);
           if(name.contains("infor")){
               System.out.println(name);
           }
        }
    }

    }


