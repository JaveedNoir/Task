package Vehicle;

public interface Vehicle {
    double FUEL_PRICE_PER_LITER = 1.5;

    double calculateFuelCost(double distance);

    void performMaintenance();

    default boolean isReadyForTrip(double distance) {
        return distance <= 1000;
    }

    static double calculateTotalCost(Vehicle vehicle, double distance) {
        return vehicle.calculateFuelCost(distance) + 20;
    }

    default void logMaintenance(String message){
        System.out.println("Log: "+message);

    }


}
