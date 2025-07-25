package MentorLesson;

public class Student extends Person {
    public Student(String name,int age){
        super(name, age);
    }
    public void speak(){
        System.out.println(name+" is speaking now...");
    }
}
