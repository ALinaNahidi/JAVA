package com.section3projects;

public class EvenOnly {
    public static void main(String[] args) {
        int i=0;
        while(i<10){
            if(i%2!=0) {
                i++;
                continue;
            }
            System.out.print(i+"\t");
            i++;
        }
    }
}
