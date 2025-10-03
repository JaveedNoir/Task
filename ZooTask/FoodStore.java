package ZooTask;

import java.util.Random;

public class FoodStore {
     volatile int foodCount=50;
     String isTurn = "lion";

     void eatFood(String animal) {
        try {
            if (foodCount <= 0) {
                System.out.println("Yimey yoxdur ureyim! Gozle... ");
            } else {
                foodCount--;
                System.out.println(animal + " yemekden yedi! " + foodCount);

            }
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("FoodStore Interrupted");
        }
    }

     void addFood(int amount,String caretaker) {
        try{
        foodCount+=amount;
        System.out.println(caretaker+" Anbara "+amount+" eded yemek elave etdi!");
        Thread.sleep(1000);
    }catch (InterruptedException e){
        System.out.println("FoodStore Interrupted");
    }
    }

    int getFoodCount()
    {return foodCount;}
}
