package evoAnnotationTask;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassInspector {

    public static void classInspec(Object person) {
        System.out.println("Class adi: " + person.getClass() +
                "\n" + "******************");
        Field[] fields = person.getClass().getDeclaredFields();
        Method[] methods = person.getClass().getDeclaredMethods();
        Constructor[] constructors = person.getClass().getDeclaredConstructors();
        for (Field field : fields) {
            System.out.println("Fieldler: " + field.getName());
        }
        System.out.println("******************");
        for (Method method : methods) {
            System.out.println("Methodlar: " + method.getName());
        }
        System.out.println("******************");

        for (Constructor constructor : constructors) {
            System.out.println("Constructor: " + constructor.getName());
        }
        System.out.println("******************");


    }
}
