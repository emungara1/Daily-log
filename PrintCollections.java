package com.company.practice.com.company.practice.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PrintCollections {

    public static void main(String args[]) {
    List<String> colors = new ArrayList<String>();
    colors.add("Blue");
    colors.add("Yellow");
    colors.add("Green");
    //colors.set(2,"orange");
    colors.add(2,"Orange");
    colors.add("Black");
    //colors.remove(1);

//    if(colors.contains("black")){
//        System.out.println("in the list");
//    }
//    else
//        System.out.println(" not in the list");

       System.out.println(colors.get(2));
        Collections.sort(colors);
        System.out.println(colors);
        for(String element : colors) {
            System.out.println(element);
        }
    }
}
