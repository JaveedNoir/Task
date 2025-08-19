package Vehicle;

public class Main {
    public static void main(String[] args) {
        Car car =new Car("BMW",14,8500,16000);
        Motorcycle motorcycle = new Motorcycle("Hayabusa",7,4200,9000,false);

        System.out.println("200 KM lik mesafeye qeder olan benzinin qiymeti "+car.model+" ucun "+car.calculateFuelCost(200));
        System.out.println("150 KM lik mesafeye qeder olan benzinin qiymeti "+motorcycle.model+" ucun "+ motorcycle.calculateFuelCost(150));
        System.out.println("---------------------------------");
        System.out.println(car.model+" surmek ucun hazirdir mi? " + car.isReadyForTrip(200));
        System.out.println(motorcycle.model+" surmek ucun hazirdir mi? " + motorcycle.isReadyForTrip(150));
        System.out.println("---------------------------------");
        System.out.println(car.model+" Butun xercleri "+Vehicle.calculateTotalCost(car,200));
        System.out.println(motorcycle.model+" Butun xercleri "+Vehicle.calculateTotalCost(motorcycle,150));
        System.out.println("---------------------------------");
        car.performMaintenance();
        motorcycle.performMaintenance();

    }
}
