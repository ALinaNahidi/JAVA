package com.section6projects;

public class MethodOverloading {
    public static void main(String[] args) {
        int result=getResult(5);
        System.out.println(result);

        result=getResult(5,4);
        System.out.println(result);

        System.out.println(getResult("5","4"));


    }

    private static int getResult(int i) {
        return i*2;
    }

    private static int getResult(int i, int j){
        return i*j;
    }

    private static String getResult(String i, String j){
        return i+ " "+j;
    }
}
