package com.sectio7projects;

public class HouseDemo {

    public static void main(String[] args) {
        House myHouse = new House("pink",5,10);
        House yourHouse = new House("green",8,13);
        printHouseData(myHouse);
        printHouseData(yourHouse);
    }

    private static void printHouseData(House obj){
        System.out.println(obj.getColor()+ " house has "+obj.getNumStories()+
                " stories and "+obj.getNumWindows()+" windows.");
    }
}
