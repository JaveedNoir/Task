package Exception4;

public class VIP implements Person {
    String name;
    int level;
    double balance;

    public VIP(String name, int level, double balance) {
        this.name = name;
        this.level = level;
        this.balance = balance;
    }

    public double dicountPay() throws IllegalArgumentException {
        try {
            if (balance <= 0) {
                throw new IllegalArgumentException();
            } else {
                return balance = balance * 1.5;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Balans yoxdur!");
        }
        return balance * 1;
    }
}
