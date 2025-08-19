package Vehicle;

public class Motorcycle implements Vehicle{
    String model;
    double fuelEfficiency;
    double lastMaintenanceMileage;
    double totalMileage;
    boolean hasSidecar;

    public Motorcycle(String model, double fuelEfficiency,
                      double lastMaintenanceMileage, double totalMileage, boolean hasSidecar) {
        this.model = model;
        this.fuelEfficiency = fuelEfficiency;
        this.lastMaintenanceMileage = lastMaintenanceMileage;
        this.totalMileage = totalMileage;
        this.hasSidecar = hasSidecar;
    }

    @Override
    public double calculateFuelCost(double distance) {
        double perKm = (fuelEfficiency * distance) / 100;
        if (hasSidecar == true) {
            return (perKm * Vehicle.FUEL_PRICE_PER_LITER) * 1.2;
        } else {
            return perKm * Vehicle.FUEL_PRICE_PER_LITER;
        }

    }

    @Override
    public void performMaintenance() {
        lastMaintenanceMileage += totalMileage;
        System.out.println("Umumi yol tutumu: "+lastMaintenanceMileage);
        logMaintenance(model);
    }

    @Override
    public boolean isReadyForTrip(double distance) {
        if (totalMileage - lastMaintenanceMileage > 5000){
            return false;
        }
        else return true;
    }
}
