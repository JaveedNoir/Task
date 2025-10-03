package ZooTask;

public class ZooApp {
    public static void main(String[] args) {
        FoodStore foodStore = new FoodStore();

        Thread lion= new Thread(new Lion(foodStore,"Richard"));
        Thread monkey =new Thread( new Monkey(foodStore,"Ravi"));
        Thread rabbit= new Thread(new Rabbit(foodStore,"Micky"));
        Thread caretaker= new Thread(new Caretaker(foodStore));
//        Thread vipFeedingRoom= new Thread(new VipFeedingRoom("Richard"));
//        Thread vipFeedingRoom2= new Thread(new VipFeedingRoom("Ravi"));
//        Thread vipFeedingRoom3= new Thread(new VipFeedingRoom("Micky"));


        lion.start();
        monkey.start();
        rabbit.start();
        caretaker.start();
//        vipFeedingRoom.start();
//        vipFeedingRoom2.start();
//        vipFeedingRoom3.start();




    }
}
