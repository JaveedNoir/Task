package Employee;

public class SalariedEmployee extends Employee{
    double monthlySalary;

    public SalariedEmployee(String id, String name, double monthlySalary) {
        super(id, name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalar() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "monthlySalary=" + monthlySalary +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
