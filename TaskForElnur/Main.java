package TaskForElnur;

import Exception2.InavlidAgeException;

public class Main {
    public static void main(String[] args) {
        try {
        Customer customer=new Customer("Cavid",15,"sk23nee");
        System.out.println(customer);
    }catch (InavlidAgeException | InvaildFinException e){
            System.out.println(e.getMessage());
        }
    }
}
