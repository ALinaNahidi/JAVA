package com.sectio8projects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInputFun {

    public static void main(String[] args) throws FileNotFoundException {

       Scanner inFile;
       int read;
       int sum=0;


       try {
           inFile = new Scanner(new File("text"));

           while(inFile.hasNext()){
               read=inFile.nextInt();
               sum+=read;
               System.out.println(read);
           }

           inFile.close();
       }
       catch (FileNotFoundException ex){
           System.out.println("File not found");
           System.out.println(ex);
       }
        System.out.println();
        System.out.println(sum);



    }
}
