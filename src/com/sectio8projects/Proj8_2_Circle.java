package com.sectio8projects;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj8_2_Circle {
    public static void main(String[] args) {
        ArrayList<Circle> arrayList = new ArrayList<>();

        fillCircle(arrayList);

        printCircles(arrayList);
    }

    private static void fillCircle(ArrayList<Circle> arrayList) {
        Scanner inFile;
        PrintWriter printWriter;

        try {
            printWriter= new PrintWriter("cirlces_output");
            inFile = new Scanner(new File("circle_data"));

            while (inFile.hasNext()){
                Circle circle = new Circle(inFile.nextDouble());

                arrayList.add(circle);

                printWriter.println("radius: "+circle.getRadius()+ "\nArea: " + circle.area()
                + "\nCircum: "+ circle.circumference()+ "\n");
            }

            printWriter.close();
            inFile.close();
        }
        catch (FileNotFoundException ex){
            System.out.println(ex);
        }
    }

    private static void printCircles(ArrayList<Circle> arrayList) {
        for (Circle circle : arrayList){
            System.out.println("Radius : " + circle.getRadius());
            System.out.println("Area : " + circle.area());
            System.out.println("Circum : " + circle.circumference());
            System.out.println();
        }
    }
}
