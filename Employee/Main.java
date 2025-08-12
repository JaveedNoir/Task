package Employee;

public class Main {
    public static void main(String[] args) {

        Employee[] employee = {
                new HourlyEmployee("1", "Nigar", 5.0, 170),          // Saatlıq işçi
                new SalariedEmployee("2", "Samir", 2500),            // Aylıq maaşlı işçi
                new ComissionEmployee("3", "Eldar", 800, 40, 3.0),   // Komissiya ilə işləyən
                new HourlyEmployee("4", "Gunay", 4.5, 160),
                new SalariedEmployee("5", "Orxan", 3000),
                new ComissionEmployee("6", "Fidan", 900, 25, 2.2),
                new HourlyEmployee("7", "Rauf", 6.0, 150),
                new SalariedEmployee("8", "Sevda", 2200)
        };

        for (Employee employee1 : employee){
            System.out.println(employee1.toString());
        }
        Company company = new Company();
company.totalPayroll();
        System.out.println(company.totalPayroll());
        System.out.println(company.highestPaid());
    }
}