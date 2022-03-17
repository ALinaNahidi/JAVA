package com.sectio7projects;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2.0);

        getDetails(circle1);
        getDetails(circle2);


    }

    private static void getDetails(Circle circle) {
        System.out.println("Radius: "+circle.getRadius());
        System.out.print("Circu: ");
        System.out.format("%.2f %n",circle.circumference());
        System.out.print("Area: ");
        System.out.format("%.2f %n ",circle.area());
        System.out.println();
    }
}
