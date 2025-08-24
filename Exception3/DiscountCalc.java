package Exception3;

public class DiscountCalc {
    String userType;
    double price;
    int quantity;
    private double discount;

    public DiscountCalc(String userType, double price, int quantity) {
        this.userType = userType;
        this.price = price;
        this.quantity = quantity;
    }

    public double calculateDiscount(DiscountCalc discountCalc){ //1-throws IllegalArgumentException yaziriqsa methodun yaninda
                                                               // mainda try catch elemeliyik.eger Yazmiriqsa metod daxilinde
                                                              //catch edilir.Bes bunun ferqi nedir?
                                                              // 2-bunlar Runtime exception olur ama bizim kod xetamiz deyil
                                                              // istifadecinin xetasi olur bes runtime exception bizim kod xetamiza gore olmurdu?
                                                             //3-normal exceptiondan ferqi ne oldu ki bunun? nece ayirt etmek olar?
                                                             //4-eger bize gore xetadirsa throw new yazilir normalda java bunu xeta oluraq gormur
                                                              // ama biznes qaydalarina gore uygun deyil.Bu zaman runtim exception olur?
        try {
            if (discountCalc.userType.equals("VIP")) {
                return this.discount = price * quantity * 0.2;
            } else if (discountCalc.userType.equals("Normal")) {
                return this.discount = price * quantity * 0.1;
            } else if (discountCalc.userType.equals("Student")){
                return this.discount = price * quantity * 0.15;
            }else {
                throw new IllegalArgumentException();
            }
        }catch (NullPointerException e){
            System.out.println("Ad Bos buraxila bilmez.");
         return this.discount = price * quantity * 0.1;
        }catch (IllegalArgumentException e){
            System.out.println("Sadece 'VIP', 'Normal', 'Student' ola bilersen!");
            return this.discount = price * quantity * 0.1;
        }
    }
}