package com.sectio8projects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj8_1_RectangleFile {
    public static void main(String[] args) {
        ArrayList<Rectangle> arrayList = new ArrayList<>();

        getRectangles(arrayList);

        printReactangle(arrayList);

    }

    private static ArrayList<Rectangle> getRectangles(ArrayList<Rectangle> arrayList) {
        Scanner inFile;


        try{
            inFile = new Scanner(new File("Rectangle_data"));

            while (inFile.hasNext()){
                Rectangle rectangle = new Rectangle(inFile.nextDouble(),inFile.nextDouble());
                arrayList.add(rectangle);
            }
            inFile.close();
        }
        catch (FileNotFoundException ex){
            System.out.println(ex);
        }
        return arrayList;
    }

    private static void printReactangle(ArrayList<Rectangle> arrayList) {
        for (Rectangle rectangle : arrayList){
            System.out.println("Length: "+rectangle.getLength());
            System.out.println("Width : "+rectangle.getWidth());
            System.out.println("Perim: "+rectangle.perimeter());
            System.out.println("Area: "+rectangle.area());
            System.out.println();
        }
    }
}
