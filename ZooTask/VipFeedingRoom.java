package ZooTask;

public class VipFeedingRoom implements Runnable{
    static int vipFeedLimit = 5;
    static int vipFeedCount;
    static String whoVip = "Richard";
     String animalName;

    public VipFeedingRoom(String animalName) {
        this.animalName = animalName;
    }



    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            feedVip(animalName);
        }
    }


    static synchronized void feedVip(String animalName) {
        try {
            while (!whoVip.equals(animalName)) {
                VipFeedingRoom.class.wait();
            }
                for (int i = 1; i <= vipFeedLimit; i++) {
                    System.out.println(animalName + " Yemek yeyir hemde VIP'de " + vipFeedCount + " eded et!");
                    vipFeedCount++;
                    Thread.sleep(1000);
                }
            changeAnimal();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void changeAnimal() {
        vipFeedCount=0;
        if (whoVip.equals("Richard")) {
            whoVip = "Ravi";
        } else if (whoVip.equals("Ravi")) {
            whoVip = "Micky";
        } else if (whoVip.equals("Micky")) {
            whoVip = "Richard";
        }
        VipFeedingRoom.class.notifyAll();
    }
}
