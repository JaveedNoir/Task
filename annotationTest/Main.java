package annotationTest;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Le", 23);
        ValidateField(person);
    }

    public static void ValidateField(Person person) {
        Field[] fields = person.getClass().getDeclaredFields();
        for (Field field : fields) {
            try {
                if (field.isAnnotationPresent(MyAnnotation.class)) {
                    MyAnnotation annotation = field.getAnnotation(MyAnnotation.class);
                    int lenght = person.getName().length();
                    if (lenght < annotation.min() || lenght > annotation.max()) {
                        throw new LenghtException("3 Reqemden cox olmalidir!");
                    } else {
                        System.out.println(person.getName() + "\n" + person.getAge());
                    }
                }
            } catch (LenghtException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}