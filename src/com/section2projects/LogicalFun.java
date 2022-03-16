package com.section2projects;

public class LogicalFun {
    public static void main(String[] args) {
        boolean isRaining=true;
        boolean isWarm=true;
        boolean combined=isRaining && isWarm;
        System.out.println("Is it raining or warm? "+combined);

        combined=isRaining || isWarm;
        System.out.println("Is it raining or warm? "+combined);

        combined=!isRaining;
        System.out.println("Is it raining or warm: "+combined);

        System.out.println();
        System.out.println();

        isRaining=true;
        isWarm=false;
        combined=isRaining && isWarm;
        System.out.println("Is it raining or warm? "+combined);

        combined=isRaining || isWarm;
        System.out.println("Is it raining or warm? "+combined);

        combined=!isRaining;
        System.out.println("Is it raining or warm: "+combined);

        System.out.println();
        System.out.println();

        isRaining=false;
        isWarm=true;
        combined=isRaining && isWarm;
        System.out.println("Is it raining or warm? "+combined);

        combined=isRaining || isWarm;
        System.out.println("Is it raining or warm? "+combined);

        combined=!isRaining;
        System.out.println("Is it raining or warm: "+combined);

        System.out.println();
        System.out.println();

        isRaining=false;
        isWarm=false;
        combined=isRaining && isWarm;
        System.out.println("Is it raining or warm? "+combined);

        combined=isRaining || isWarm;
        System.out.println("Is it raining or warm? "+combined);

        combined=!isRaining;
        System.out.println("Is it raining or warm: "+combined);

    }
}
