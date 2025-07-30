package Animal;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog(),
                new Cat()
        };

        for (Animal animal : animals){
            animal.makeSound();
        }
        System.out.println("*********");

        for (Animal animal : animals){
            if (animal instanceof Dog){
                Dog dog = (Dog) animal;
                dog.fetching();
            } else if (animal instanceof  Cat) {
                Cat cat = (Cat) animal;
                cat.scratch();

            }
        }

    }
}
