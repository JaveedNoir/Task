package Exception3;

public class Main {
    public static void main(String[] args) {
        DiscountCalc calc = new DiscountCalc("VIP", 100, 2);
        DiscountCalc calc1 = new DiscountCalc(null, 100, 2);
        DiscountCalc calc2 = new DiscountCalc("HACKER", 100, 2);
        DiscountCalc calc3 = new DiscountCalc("VIP", 0, 2);


        System.out.println(calc.calculateDiscount(calc));
        System.out.println(calc.calculateDiscount(calc1));
        System.out.println(calc.calculateDiscount(calc2));
        System.out.println(calc.calculateDiscount(calc3));
    }
}
