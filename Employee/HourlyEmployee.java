package Employee;

public class HourlyEmployee extends Employee {
    double hourlyRate;
    double hoursWorked;

    public HourlyEmployee(String id, String name, double hourlyRate, double hoursWorked) {
        super(id, name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalar() {
        double overHours = 0;
        if (hoursWorked > 160) {
            overHours = hoursWorked - 160;
            return (160 * hourlyRate) + (overHours * hourlyRate * 1.5);
        } else {
            return hoursWorked * hourlyRate;

        }
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "id='" + id + '\'' +
                ", hoursWorked=" + hoursWorked +
                ", hourlyRate=" + hourlyRate +
                ", name='" + name + '\'' +
                '}';
    }
}
