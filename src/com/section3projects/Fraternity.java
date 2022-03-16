package com.section3projects;

import java.util.Scanner;

public class Fraternity {

    public static void main(String[] args) {
        int age;
        String gender;

        var scanner = new Scanner(System.in);

        System.out.println("Enter your age");
        age=scanner.nextInt();


        System.out.println("Enter your gender");
        gender= String.valueOf(scanner.next().charAt(0));


        if(age>=19 && gender.equalsIgnoreCase("m"))
            System.out.print("Eligible");
        else
            System.out.print("Not eligible");




    }
}
