package Main_1;

public class Animal {
    int age;
    String name;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void run(){
        System.out.println(this.name + " пробежал");
    }
}
