package MentorLesson;

public class Person {
    String name;
    int age;

    Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void speak(){
        System.out.println("Person is speaking now...");
    }

    public  void write(){
        System.out.println("Person is writing now...");
    }
}
