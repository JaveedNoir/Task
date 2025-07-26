package Student;

import java.util.Scanner;

public class School {
    Scanner input = new Scanner(System.in);
    Student[] students;
    int studentCount;

    void addStudent() {
        System.out.println("Telebenin adini qeyd et: ");
        String name = input.nextLine();

        System.out.println("Telebenin ID'sini qeyd edin: ");
        int sudentId = input.nextInt();

        System.out.println("Telebenin yasini qeyd edin: ");
        int age = input.nextInt();

        System.out.println("Qiymeti qeyd edin: ");
        double grade = input.nextDouble();

        Student student = new Student(name, sudentId, age, grade);
        students[studentCount] = student;
        studentCount++;


    }

    void searchStudent(){
        System.out.println("Axtardiginiz Telebenin ID'sini yazin: ");

        boolean found = false;
        int searchID = input.nextInt();

        for (int i = 0; i < studentCount; i++) {
            if (students[i].studentId == searchID){

                found=true;

                System.out.println("Telebe tapildi!");
                System.out.println("Telebenin adi-"+students[i].name);
                System.out.println("Yasi-"+students[i].age);
                System.out.println("ID'si-"+students[i].studentId);
                System.out.println("Qiymeti-"+students[i].grade);

                break;
            }
        }
        if (found==false){
            System.out.println("Telebe tapilmadi!");
        }
    }
    void changeGrade(){
        System.out.println("Deyismek istediyiniz telebenin ID'sini qeyd edin:");
        int searhId = input.nextInt();

        boolean found= false;

        for (int i = 0; i < studentCount; i++) {
            if (students[i].studentId == searhId){
                found=true;
                System.out.println("Telebe tapildi!");
                System.out.println("Deyismek istediyiniz qiymeti girin: ");
                students[i].grade=input.nextDouble();
                break;
            }
        }
        if (found==false){
            System.out.println("Telebe tapilmadi!");
        }
    }

    void studentInfo (){
        for (Student student : students){
            System.out.println(student.name);
            System.out.println(student.age);
            System.out.println(student.studentId);
            System.out.println(student.grade);
            System.out.println("**************");
        }
    }
}
