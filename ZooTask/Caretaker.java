package ZooTask;

import java.util.Random;

public class Caretaker implements Runnable {
    FoodStore foodStore;
    String caretaker = "Shahriyar";
     Random rand = new Random();


    public Caretaker(FoodStore foodStore) {
        this.foodStore = foodStore;
    }

    @Override
    public void run() {
        try {
            synchronized (foodStore) {
                for (int i = 0; i < 50; i++) {
                     int foodCounter = rand.nextInt(20);
                    while (!(foodStore.foodCount == 0)) {
                        foodStore.wait();
                    }
                    foodStore.addFood(foodCounter, caretaker);
                    foodStore.notifyAll();
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
