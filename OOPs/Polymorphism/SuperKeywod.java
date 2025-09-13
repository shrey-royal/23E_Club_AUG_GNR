class Bakery {
    String name = "General Bakery";
    double basePrice = 100.0;

    Bakery() {
        System.out.println("Bakery established");
    }

    Bakery(String name) {
        this.name = name;
        System.out.println("Bakery established: " + name);
    }

    void bake() {
        System.out.println("Baking simple bread");
    }

    void showDetails() {
        System.out.println("Bakery: " + name);
        System.out.println("Base Price: Rs." + basePrice);
    }

    double calculatePrice() {
        return basePrice;
    }
}

class CakeBakery extends Bakery {
    String name = "Cake Specialist";
    double decorationCost = 50.0;

    CakeBakery() {
        super();    // calls Bakery() - must be first statement
        System.out.println("Cake Bakery opened");
    }

    CakeBakery(String name) {
        super(name);    // calls Bakery(String) - must be first statement
        System.out.println("Specialized cake bakery: " + name);
    }

    @Override
    void bake() {
        super.bake();   // calls Bakery's bake() method
        System.out.println("Adding cake layers and frosting");
    }

    @Override
    void showDetails() {
        System.out.println("Child specialty: " + this.name); // CakeBakery's name
        System.out.println("Parent type: " + super.name); // Bakery's name
        super.showDetails(); // Calls Bakery's showDetails()
        System.out.println("Decoration cost: Rs." + decorationCost);
    }

    @Override
    double calculatePrice() {
        return super.calculatePrice() + decorationCost;
    }

    void prepareSpecialOrder() {
        super.bake();
        System.out.println("Adding custom decorations");
        System.out.println("Total cost: Rs." + calculatePrice());
    }
}

public class SuperKeywod {
    public static void main(String[] args) {
        System.out.println("=== Constructor Chaining ===");
        CakeBakery cb1 = new CakeBakery();
        System.out.println();

        CakeBakery cb2 = new CakeBakery("Spicy Cakes");
        System.out.println();

        System.out.println("=== Method Overriding ===");
        cb2.bake();
        System.out.println();

        System.out.println("=== Variable Access ===");
        cb2.showDetails();
        System.out.println();

        System.out.println("=== Parent Method in Calculation ===");
        System.out.println("Final price: Rs." + cb2.calculatePrice());
        System.out.println();

        System.out.println("=== Parent Method Access ===");
        cb2.prepareSpecialOrder();
    }
}