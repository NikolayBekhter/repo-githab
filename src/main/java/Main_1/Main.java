package Main_1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Animal animal = new Animal(1, "Bobik");
        animal.run();

        Cat cat = new Cat(2, "Barsik");
        cat.run();

        Dog dog = new Dog(3, "Rex");
        dog.run();
    }
}
