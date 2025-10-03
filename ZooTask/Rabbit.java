package ZooTask;

public class Rabbit extends Animal {
    public Rabbit(FoodStore foodStore, String name) {
        super(foodStore, name);
    }

    @Override
    void eat() {
        try {
            synchronized (foodStore) {

            for (int i = 0; i < 50; i++) {
                while (!foodStore.isTurn.equals("rabbit") || foodStore.foodCount <= 0) {
                    foodStore.wait();
                }
                foodStore.eatFood(this.name);
                foodStore.isTurn = "lion";
                foodStore.notifyAll();
            }
            }

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

}
