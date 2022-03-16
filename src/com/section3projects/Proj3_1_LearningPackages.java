package com.section3projects;

import java.util.Scanner;

public class Proj3_1_LearningPackages {
    public static void main(String[] args) {
//        int packageNumber;
//        int totalCoursesEnrolled;
//        int totalCost=0;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the package 1,2 or 3:\t");
//        packageNumber=scanner.nextInt();
//
//        System.out.print("Enter the number of courses enrolled:\t");
//        totalCoursesEnrolled=scanner.nextInt();
//
//        switch (packageNumber){
//            case 1:
//                totalCost=10;
//                if(totalCoursesEnrolled>2)
//                    totalCost+=6*(totalCoursesEnrolled-2);
//                break;
//
//            case 2:
//                totalCost=12;
//                if(totalCoursesEnrolled>4)
//                    totalCost+=4*(totalCoursesEnrolled-4);
//                break;
//
//            case 3:
//                totalCost=15;
//                if(totalCoursesEnrolled>6)
//                    totalCost+=3*(totalCoursesEnrolled-6);
//                break;
//        }
//        System.out.println(totalCost);
//    }
        int packageNumber;
        int totalCoursesEnrolled;
        int baseCost;
        int baseCourses;
        int additionalChargesPerCourse;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the package 1,2 or 3:\t");
        packageNumber=scanner.nextInt();

        System.out.print("Enter the number of courses enrolled:\t");
        totalCoursesEnrolled=scanner.nextInt();

        switch (packageNumber){
            case 1:
                baseCost=10;
                baseCourses=2;
                additionalChargesPerCourse=6;
                break;

            case 2:
                baseCost=12;
                baseCourses=4;
                additionalChargesPerCourse=4;
                break;

            case 3:
                baseCost=15;
                baseCourses=6;
                additionalChargesPerCourse=3;
                break;

            default:
                baseCost=0;
                baseCourses=0;
                additionalChargesPerCourse=0;
                break;
        }

        System.out.println(baseCost+(additionalChargesPerCourse*(totalCoursesEnrolled-baseCourses)));

    }
}
