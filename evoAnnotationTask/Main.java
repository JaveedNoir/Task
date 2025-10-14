package evoAnnotationTask;

import static evoAnnotationTask.ClassInspector.classInspec;

public class Main {
    public static void main(String[] args) {
//        NumberComparator<Number> numberComparator = new NumberComparator<>();
//              //Task 1
//        System.out.println(numberComparator.findMax(10, 20));
//        System.out.println(numberComparator.findMin(10, 20));

        Person person = new Person("Javid", "Gulaliyev", 23);
        classInspec(person);
    }

}