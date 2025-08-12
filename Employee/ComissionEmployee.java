package Employee;

public class ComissionEmployee extends Employee{
    double baseSalary;
    double totalSales;
    double comissionRate;

    public ComissionEmployee(String id, String name, double baseSalary, double totalSales, double comissionRate) {
        super(id, name);
        this.baseSalary = baseSalary;
        this.totalSales = totalSales;
        this.comissionRate = comissionRate;
    }

    @Override
    double calculateSalar() {
        return baseSalary + (totalSales * comissionRate);
    }

    @Override
    public String toString() {
        return "ComissionEmployee{" +
                "baseSalary=" + baseSalary +
                ", totalSales=" + totalSales +
                ", comissionRate=" + comissionRate +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
