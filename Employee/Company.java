package Employee;

public class Company {
    Employee[] employees = {
            new HourlyEmployee("1", "Shovkat", 2.4, 165),
            new SalariedEmployee("2", "Karim", 1235),
            new ComissionEmployee("3", "Turgut", 700, 15, 2.4)
    };

    void addEmployee() {
        for (int i = 0; i <= employees.length; i++) {
            if (i == employees.length) {
                employees[i + 1] = new SalariedEmployee("4", "Leyla", 1400);
            }

        }
    }

    double totalPayroll() {
        double total = 0;
        for (Employee employee : employees) {

            total += employee.calculateSalar();



        }return total;
    }

        double highestPaid() {
            double topMoney = 0;
            for (Employee employee : employees) {

                topMoney = employee.calculateSalar();
                if (topMoney < employee.calculateSalar()) {
                    topMoney = employee.calculateSalar();
                    return topMoney;
                } else {

                }
            }return topMoney;

        }
    public Employee[] employeesWithSalaryAbove(double threshold) {
        int count = 0;
        for (Employee employee : employees) {
            if (employee.calculateSalar() > threshold) {
                count++;
            }
        }

        Employee[] filtered = new Employee[count];
        int index = 0;
        for (Employee employee : employees) {
            if (employee.calculateSalar() > threshold) {
                filtered[index++] = employee;
            }
        }

        return filtered;
    }
    void printPayrRollReport(){
        for (Employee employee : employees){
            employees.toString();
        }
    }
}






