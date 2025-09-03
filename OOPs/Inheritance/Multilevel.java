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

class Puppy extends Dog {
    void sleep() {
        System.out.println("Puppy sleeps.");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Puppy pup = new Puppy();

        pup.eat();
        pup.run();
        pup.sleep();
    }
}
