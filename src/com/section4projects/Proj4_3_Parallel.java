package com.section4projects;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_3_Parallel {
    public static void main(String[] args) {
        String name;
        int age;

        var scanner = new Scanner(System.in);

        ArrayList<String> nameList = new ArrayList<>();
        int[] ageList = new int[5];

        for (int i = 0; i < ageList.length; i++) {
            System.out.print("Enter name:\t");
            name = scanner.nextLine();

            System.out.print("Enter age:\t");
            age = scanner.nextInt();
            //consume newline
            scanner.nextLine();
            System.out.println();

            nameList.add(name);
            ageList[i] = age;

        }

        for (int i = 0; i < ageList.length; i++) {
            System.out.println(nameList.get(i) + " is " + ageList[i] + " years old");
        }


    }
}
