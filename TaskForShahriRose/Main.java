package TaskForShahriRose;

public class Main {
    public static void main(String[] args) {
        Department department = new Department(1,"IT",5);
        Employee employee=new Employee(1,"Sabir","Behbehov");
        Employee employee1=new Employee(2,"Samira","Efendi");
        Employee employee2=new Employee(3,"Sima","Herecli");
        Employee employee3=new Employee(4,"Tamerlan","Maran");

//    department.addEmployee(employee);
//    department.addEmployee(employee1);
//    department.addEmployee(employee2);
    department.updateEmployee(employee3,2);

    try {
    department.getAllEmployee();
    }catch (Exception e){
        System.out.println(e.getMessage());
    }
    }
}
