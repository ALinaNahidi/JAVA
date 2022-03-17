package com.sectio7projects;

public class IceCreamDemo {
    public static void main(String[] args) {
        IceCream iceCream1 = new IceCream("Chocolate",70,5);
        IceCream iceCream2 = new IceCream("Pista",80,3);

        iceCream1.addToppings("nuts");
        iceCream1.addToppings("cherries");

        iceCream2.addToppings("chocolate");
        iceCream2.addToppings("springles");

        System.out.println("Ice cream 1 toppings:");
        iceCream1.printToppings();
        System.out.println();

        System.out.println("Ice cream 2 toppings:");
        iceCream2.printToppings();


    }
}
