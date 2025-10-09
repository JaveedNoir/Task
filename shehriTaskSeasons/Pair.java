package shehriTaskSeasons;

public class Pair <T, U>{
    private T key;
    private U value;

    public Pair(T key, U value) {
        this.key = key;
        this.value = value;
    }

    public void display(){
        System.out.println(key);
        System.out.println(value);
    }
}
