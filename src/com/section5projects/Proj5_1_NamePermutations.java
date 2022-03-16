package com.section5projects;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj5_1_NamePermutations {
    public static void main(String[] args) {
        final int TOTAL_USERS=5;
        String fullName;

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> firstNameList=new ArrayList<>();
        ArrayList<String> lastNameList=new ArrayList<>();

        for(int i=0;i<TOTAL_USERS;i++){
            System.out.print("Enter fullName "+(i+1)+":\t");
            fullName=scanner.nextLine();
            firstNameList.add(fullName.substring(0,fullName.indexOf(" ")));
            lastNameList.add(fullName.substring(fullName.indexOf(" ")+1));
        }
        for(String i :firstNameList){
            for(String j  :lastNameList)
                System.out.println(i+ " "+j);
        }


    }
}
