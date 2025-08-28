package TaskForElnur;

import Exception2.InavlidAgeException;

public class Customer {
    private String name;
    private int age;
    private String fin;

    public Customer(String name, int age, String fin) throws InavlidAgeException,InvaildFinException {

            this.name = name;
            this.age = age;
            if (age <18){
                throw new InvalidAgeException("Yas 18 den asagi ola bilmez!");
            }
            this.fin = fin;
            if (fin.length() != 7){
                throw new InvaildFinException("Finin uzunlugu 7 olmalidir");
            }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", fin='" + fin.toUpperCase() + '\'' +
                '}';
    }
}
//Constructurun icinde try catch eledim lakin obyekt yarimciq yarandi.Buna gore throws edib mainde try catch etdim.
//Ama bu seferde gerek onu yaratdigimzi methodlarda isletdikde ya static edim ya da ki try in icinde istifade edim?
//Fin exceptionunda normal cap olunur terminala amma yas exceptionunda Qirmizi herflerle yazir