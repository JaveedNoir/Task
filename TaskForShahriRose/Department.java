package TaskForShahriRose;

import java.util.Arrays;

public class Department {
    private int id;
    private String departmentName;
    private Employee[] employees;
    private int employeeSum;

    public Department(int id, String departmentName, int size) {
        this.id = id;
        this.departmentName = departmentName;
        this.employees = new Employee[size];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Department{" + "id=" + id + ", departmentName='" + departmentName + '\'' + ", employees=" + Arrays.toString(employees) + '}';
    }

    public void addEmployee(Employee employee) {
        try {
            if (employee == null) {
                throw new MyNullException("Nulldur Employee");
            }
            employees[employeeSum] = employee;
            employeeSum++;

        } catch (MyNullException e) {
            System.out.println(e.getMessage());

        }
    }

    public void updateEmployee(Employee employee, int id) {
        try {
            if (employee == null) {
                throw new MyNullException("Employee obyekti bosdur");
            }
            boolean isNull = true;
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null) {
                    isNull = false;
                    break;
                }

            }
            if (isNull) {
                throw new ArrayEmptyException("Array bosdur");
            }
            if (id < 0) {
                throw new NoArrayElementFound("ID Sehvdir");
            }

            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null && employees[i].getId() == id) {
                    employees[i] = employee;
                    System.out.println("Employee Update oldu");
                    return;
                }
            }
            throw new NoArrayElementFound("Belə bir ID-yə sahib employee tapılmadı");

        } catch (ArrayEmptyException e) {
            System.out.println(e.getMessage());
        } catch (NoArrayElementFound e) {
            System.out.println(e.getMessage());
        } catch (MyNullException e) {
            System.out.println(e.getMessage());

        }

    }

    public void getAllEmployee() throws Exception {
        boolean hasEmployee = false;
        for (Employee employee : employees) {
            if (employee != null) {
                hasEmployee = true;
                System.out.println(employee);
            }
        }
        if (!hasEmployee) {
            throw new Exception("Employee tapilmadi");
        }
    }
}