package MentorLesson;

public class Teacher extends Person {
    public Teacher(String name, int age) {
        super(name, age);
    }

    public void write(){
        System.out.println(name+" is writing now...");
    }
}
