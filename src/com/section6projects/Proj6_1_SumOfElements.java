package com.section6projects;

import java.util.ArrayList;

public class Proj6_1_SumOfElements {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();

        array.add(10);
        array.add(20);
        array.add(10);
        array.add(30);
        array.add(10);
        array.add(50);
        array.add(100);

        System.out.println("The sum is "+sumOfElements(array));

    }

    private static int sumOfElements(ArrayList<Integer> array){
        int sum=0;
        for(Integer i:array){
            sum+= i;
        }
        return sum;
    }
}
