//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.name="Shahriyar";
        person.surname="Samdeli";
        person.age=20;

        int age = person.ageCalc(person.age);
        person.age2=age;


        person.info();



    }
}