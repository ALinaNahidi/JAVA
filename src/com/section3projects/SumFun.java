package com.section3projects;

import java.util.Scanner;

public class SumFun {
    public static void main(String[] args) {
        int sum=0;
        int input;

        var scanner = new Scanner(System.in);
        System.out.print("Enter an integer +ve or -ve: ");
        input=scanner.nextInt();
        while(input>=0){

            sum+=input;
            System.out.print("Enter an integer +ve or -ve: ");
            input=scanner.nextInt();
        }
        System.out.println("Sum="+sum);

    }
}
