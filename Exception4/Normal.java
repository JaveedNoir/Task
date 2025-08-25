package Exception4;

public class Normal implements Person {
    String name;
    boolean isNewUser;
    double balance;

    public Normal(String name, boolean isNewUser, double balance) {
        this.name = name;
        this.isNewUser = isNewUser;
        this.balance = balance;
    }

    @Override
    public double dicountPay() throws IllegalArgumentException {
        try {
            if (balance <= 0) {
                throw new IllegalArgumentException();
            } else {
                return balance = balance * 1.2;
            }
        }catch (IllegalArgumentException e){
            System.out.println("Balans yoxdur!");
        }
        return balance * 1;
    }
}