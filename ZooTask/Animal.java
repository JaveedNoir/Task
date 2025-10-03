package ZooTask;

public abstract class Animal implements Runnable {
    FoodStore foodStore;
    String name;

    public Animal(FoodStore foodStore, String name) {
        this.foodStore = foodStore;
        this.name = name;
    }

    abstract void eat();

    @Override
    public void run() {
        eat();
    }
}
