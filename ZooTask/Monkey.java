package ZooTask;

public class Monkey extends Animal {
    public Monkey(FoodStore foodStore, String name) {
        super(foodStore, name);
    }

    @Override
    void eat() {
        try {
            synchronized (foodStore) {

                for (int i = 0; i < 50; i++) {
                    while (!foodStore.isTurn.equals("monkey") || foodStore.foodCount <= 0) {
                        foodStore.wait();
                    }
                    foodStore.eatFood(this.name);
                    foodStore.isTurn = "rabbit";
                    foodStore.notifyAll();
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
