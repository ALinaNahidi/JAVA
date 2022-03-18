package com.sectio8projects;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwiceData {
    public static void main(String[] args) {
        Scanner scanner;
        PrintWriter printWriter;

        try{
            printWriter = new PrintWriter("twice_nums");
            scanner = new Scanner(new File("nums"));

            int input;
            while(scanner.hasNext()){
                input= scanner.nextInt();
                printWriter.println(input*2);
            }

            printWriter.close();
            scanner.close();

        }
        catch (FileNotFoundException ex){
            System.out.println(ex);
        }
    }
}
