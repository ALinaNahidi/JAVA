package com.sectio7projects;

import java.util.ArrayList;

public class IceCream {
    private String name;
    private int cost;
    private int numScoops;
    private ArrayList<String> toppings;

    public IceCream(String name, int cost, int numScoops) {
        this.name = name;
        this.cost = cost;
        this.numScoops = numScoops;
        toppings = new ArrayList<>();
    }

    public void addToppings(String topping){
        this.toppings.add(topping);
    }

    public void printToppings(){
        for (String t: toppings)
            System.out.println("\t"+ t);
    }




    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getNumScoops() {
        return numScoops;
    }
}
