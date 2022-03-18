package com.sectio2projects;

import java.util.Scanner;
public class KeyboardInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        String city;
        int age;
        double realNumber;

        System.out.println("Enter a real number?");
        realNumber = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.println("What is your name?");
        name = keyboard.nextLine();

        System.out.println("What is your age?");
        age = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("What city do u live in?");
        city = keyboard.nextLine();

        System.out.println("Real number: "+realNumber*2);
        System.out.println("Hello, "+name);
        System.out.println("age is "+age);
        System.out.println("city is "+city);


    }
}