package com.section6projects;

public class MethodsDemo {

    public static void main(String[] args) {
        double square=getSquare(10);
        System.out.println(square);
    }

    private static double getSquare(int i) {
        return i*i;
    }
}
