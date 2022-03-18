package com.sectio2projects;

import java.util.Scanner;

public class Proj2_2_MadLibsClone {
    public static void main(String[] args) {
        String adjective1;
        String girlsName;
        String adjective2Occupation1;
        String place;
        String clothing;
        String hobby;
        String adjective3Occupation2;
        String boysName;
        String mansName;

        var scanner = new Scanner(System.in);

        System.out.print("Enter an adjective: ");
        adjective1=scanner.nextLine();

        System.out.print("Enter girl's name: ");
        girlsName=scanner.nextLine();

        System.out.print("Enter another adjective: ");
        adjective2Occupation1=scanner.nextLine();

        System.out.print("Enter the name of the place: ");
        place=scanner.nextLine();

        System.out.print("Enter then name of the piece of clothing: ");
        clothing=scanner.nextLine();

        System.out.print("Enter the name of a hobby: ");
        hobby=scanner.nextLine();

        System.out.print("Enter another adjective: ");
        adjective3Occupation2=scanner.nextLine();

        System.out.print("Enter a boy's name: ");
        boysName=scanner.nextLine();

        System.out.print("Enter a man's name: ");
        mansName=scanner.nextLine();

        String msg;
        msg= "There once was a "+adjective1+" girl named "+girlsName+", who was a "
                +adjective2Occupation1+" in the kingdom of "+place+".\nShe loved to wear "
                +clothing+ " and to "+hobby+".\n"+"She wanted to marry the "+adjective3Occupation2
                +" named "+boysName+" but her father, King "+mansName+" forbid her from seeing him.";

        System.out.println(msg);



    }
}