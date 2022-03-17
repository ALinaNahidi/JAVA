package com.section6projects;

import java.util.Random;

public class FunWith2DArray {
    public static void main(String[] args) {
        int[][] array= new int[2][3];

        fill2DArray(array);
        print2DArray(array);

        System.out.println();

        twice2DArray(array);
        print2DArray(array);

    }

    private static void fill2DArray(int[][] array){
        var random = new Random();
        for(int i=0;i<array.length;i++){ //gives no. of rows
            for(int j=0;j<array[i].length;j++)//length of each row
                array[i][j]=random.nextInt(100);
        }
    }
    private static void print2DArray(int[][] array){
        for(int[] row: array){
            for(int column: row)
                System.out.print(column+ "   ");
            System.out.println();
        }

    }

    private static void twice2DArray(int[][] array){
        for(int i=0;i<array.length;i++)
            for(int j=0;j<array[i].length;j++)
                array[i][j]*=2;
    }


}
