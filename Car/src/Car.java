public class Car {
    String mark;
    String model;
    String color;
    int speed;
    double price;


  public  Car() {

        this.mark = "Null";
        this.color = "Null";
        this.model = "Null";
        this.speed = 0;

    }


   public Car(String mark, String model, String color, int speed, double price) {
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.speed = speed;
        this.price = price;
    }

   public void infoCar() {
        System.out.println("Masinin markasi-" + mark);
        System.out.println("Masinin rengi-" + color);
        System.out.println("Masinin sureti-" + speed);
        System.out.println("Masinin modeli-" + model);
        System.out.println("Masinin qiymeti-"+ price);
        if (mark == "Audi"){
            System.out.println("Masinin Qiymeti 20% Endirimle-"+ carPriceCalc());
        }

    }
   public double carPriceCalc (){
        if (mark == "Audi"){  //arasdirmagima gore == etmek sehvdir equals isletmeliyem,== referanslarin eyniliyin
                                                          // sorgulayir, equals elementleri amma tam melumatim yoxdur...
            price *= 0.8;

        }
        return price;
    }

}