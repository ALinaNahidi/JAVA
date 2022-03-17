package com.section6projects;

public class CountDown {
    public static void main(String[] args) {
        countRecursive(5,10);
    }

    private static void countRecursive(int start, int end) {
        if (start<=end){
            System.out.println(start);
            countRecursive(start+1,end);
        }
    }
}
