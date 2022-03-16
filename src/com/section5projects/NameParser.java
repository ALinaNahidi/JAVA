package com.section5projects;

import java.util.Locale;
import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {
        String name;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first and last name:\t");
        name=scanner.nextLine();

        String lastName= name.substring(name.indexOf(" ")+1);
        String firstName= name.substring(0,name.indexOf(" "));

        System.out.println(firstName.toUpperCase(Locale.ROOT));
        System.out.println(lastName.toLowerCase(Locale.ROOT));


    }
}
