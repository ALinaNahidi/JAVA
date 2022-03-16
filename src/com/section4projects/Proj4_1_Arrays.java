package com.section4projects;

import java.util.Scanner;

public class Proj4_1_Arrays {
    public static void main(String[] args) {

        var scanner= new Scanner(System.in);

        var array = new int[5];
        for(int i=0;i<array.length;i++){
            System.out.print("Enter No."+(i+1)+" : ");
            array[i]=scanner.nextInt();
        }
        for(int i=0;i<array.length;i++){
            System.out.println("The result is: "+array[i]*2);
        }


    }
}

