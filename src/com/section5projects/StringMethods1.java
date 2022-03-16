package com.section5projects;

public class StringMethods1 {

    public static void main(String[] args) {
        String name1="Alina Nahidi";
        String name2="John Baugh";

        if(name1.compareTo(name2)>0)
            System.out.println(name1 +" is greater than " +name2 );
        else if(name1.compareTo(name2)<0)
            System.out.println(name1 +" is less than " +name2 );
        else
            System.out.println(name1 +" is equal to " +name2 );
    }
}
