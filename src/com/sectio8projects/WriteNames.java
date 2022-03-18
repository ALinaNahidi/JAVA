package com.sectio8projects;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class WriteNames {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        arrayList.add("e");
        arrayList.add("f");

        try{
            PrintWriter printWriter = new PrintWriter("output");
            for (String i : arrayList)
                printWriter.println(i);
            printWriter.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not Found");
            e.printStackTrace();
        }

    }

}
