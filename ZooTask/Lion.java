package ZooTask;

public class Lion extends Animal {
    public Lion(FoodStore foodStore, String name) {
        super(foodStore, name);
    }

    @Override
    void eat() {
        try {
            synchronized (foodStore) {
                for (int i = 0; i < 50; i++) {
                    while (!foodStore.isTurn.equals("lion") || foodStore.foodCount <= 0) {
                        foodStore.wait();
                    }
                    foodStore.eatFood(this.name);
                    foodStore.isTurn = "monkey";
                    foodStore.notifyAll();
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
