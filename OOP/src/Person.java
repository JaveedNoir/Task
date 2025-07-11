public class Person {
    String name;
    String surname;
    int age ;
    int age2;

    public Person(){

    }
    void info(){
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("2x Age: " + age2);
    }
    int ageCalc( int a){
        int age2x = a * 2;
        return age2x;

    }
}

