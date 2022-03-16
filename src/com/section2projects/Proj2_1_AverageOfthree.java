package com.section2projects;

import java.util.Scanner;

public class Proj2_1_AverageOfthree {
    public static void main(String[] args) {
        final int THREE_AVG=3;

        double num1,num2,num3;
        double average;

        var scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        num1=scanner.nextDouble();

        System.out.print("Enter second number: ");
        num2=scanner.nextDouble();

        System.out.print("Enter last number: ");
        num3=scanner.nextDouble();

        average=(num1+num2+num3)/THREE_AVG;

        System.out.println("Average is: "+average);


    }
}
