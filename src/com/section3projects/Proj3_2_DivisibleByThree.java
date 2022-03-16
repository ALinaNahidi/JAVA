package com.section3projects;

import java.util.Scanner;

public class Proj3_2_DivisibleByThree {
    public static void main(String[] args) {
        int input;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number:\t");
        input=scanner.nextInt();

        if(input%3==0)
            System.out.println(input+" is divisible by 3");
        else
            System.out.println(input+" is not divisible by 3");
    }
}
