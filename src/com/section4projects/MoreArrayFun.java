package com.section4projects;

public class MoreArrayFun {

    public static void main(String[] args) {
	   int[] array = new int[10];
       for(int i=1;i<=10;i++)
           array[i-1]=i;
       for(int i:array)
           System.out.println(i);
    }
}
