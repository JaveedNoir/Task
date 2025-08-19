package Vehicle;

public class Car implements Vehicle {
    String model;
    double fuelEfficiency;
    double lastMaintenanceMileage;
    double totalMileage;

    public Car(String model, double fuelEfficiency,
               double lastMaintenanceMileage, double totalMileage) {
        this.model = model;
        this.fuelEfficiency = fuelEfficiency;
        this.lastMaintenanceMileage = lastMaintenanceMileage;
        this.totalMileage = totalMileage;
    }

    @Override
    public double calculateFuelCost(double distance) {
        double perKm= (fuelEfficiency *distance) / 100;
        return perKm * Vehicle.FUEL_PRICE_PER_LITER;
    }

    @Override
    public void performMaintenance() {
        lastMaintenanceMileage += totalMileage;
        System.out.println("Umumi yol tutumu: "+lastMaintenanceMileage);
        logMaintenance(model);
    }

    @Override
    public boolean isReadyForTrip(double distance) {
        if (totalMileage - lastMaintenanceMileage > 10000){
            return false;
        }
        else return true;
    }
}
