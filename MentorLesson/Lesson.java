package MentorLesson;

public class Lesson {
    public static void main(String[] args) {


        String az = "Azerbaycan";
        String az2 = "Azerbaycan";

        System.out.println("New ile yaradilmayan String:");
        System.out.println(az == az2);
        System.out.println();

        String greating = new String("Hello");
        String greating2 = new String("Hello");

        System.out.println("New ile yaradilan String:");
        System.out.println(greating == greating2);
    }

}
