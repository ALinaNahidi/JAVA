package com.section2projects;

public class RelationalFun {
    public static void main(String[] args) {
        boolean mybool=true;
        boolean yourbool=false;
        int myAge=21;
        int yourAge=20;
        int bobsAge=23;

        System.out.println("Mybool is "+mybool);
        System.out.println("Yourbool is "+yourbool);

        boolean ageComparison=myAge>yourAge;
        System.out.println("myAge > yourAge?: "+ageComparison);

        ageComparison=yourAge<bobsAge;
        System.out.println("yourAge > bobsAge?:" + ageComparison);

        ageComparison= yourAge==bobsAge;
        System.out.println("yourAge == bobsAge?:" + ageComparison);

        String myName= "Alina";
        String yourName= "Alina";
        boolean nameComparison=myName == yourName;
        System.out.println("myName == yourName?:"+nameComparison);

        int currentAge=myAge;
        System.out.println("If my current age is >=21: "+ (currentAge>=21));


    }
}
