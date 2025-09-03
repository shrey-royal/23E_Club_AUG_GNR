class Animal {
    void eat() {
        System.out.println("Animal eats.");
    }
}

class Dog extends Animal {
    void run() {
        System.out.println("Dog runs.");
    }
}

class Bat extends Animal {
    void sleep() {
        System.out.println("Bat sleeps upside down.");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.run();

        Bat b = new Bat();
        b.eat();
        b.sleep();
    }
}