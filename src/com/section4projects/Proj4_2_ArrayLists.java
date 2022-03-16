package com.section4projects;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_2_ArrayLists {
    public static void main(String[] args) {
        double input;

        var scanner = new Scanner(System.in);

        ArrayList<Double> array = new ArrayList<>();

        System.out.println("Enter a number greater than 0 to input in an array or -ve no. to exit");
        input=scanner.nextDouble();

        while(input>0){
            array.add(input);
            System.out.println("Enter a number greater than 0 to input in an array or -ve no. to exit");
            input=scanner.nextDouble();
        }

        for(int i=array.size()-1;i>=0;i--){
            System.out.println(array.get(i));
        }
    }
}
