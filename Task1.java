class Item {
    String name;
    double price;
    int qty;

    Item(String name, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    void getItem() {
        System.out.println("Name: " + name + ", Price: " + price + ", Quantity :" + qty);
    }
}

class ShoppingCart {
    Item[] items;
    int capacity, currentItemCount;

    ShoppingCart() {
        capacity = 10;
        currentItemCount = 0;
        items = new Item[capacity];
    }

    ShoppingCart(int capacity) {
        this.capacity = capacity;
        this.currentItemCount = 0;
        items = new Item[capacity];
    }

    ShoppingCart(Item[] items) {
        this.items = items;
        this.capacity = items.length;
    }

    void addItem(Item item) {
        if(currentItemCount < capacity) {
            items[currentItemCount++] = item;
        } else {
            System.out.println("Cart is full!");
        }
    }

    void addItem(String name, double price, int qty) {
        if(currentItemCount < capacity) {
            items[currentItemCount++] = new Item(name, price, qty);
        } else {
            System.out.println("Cart is full!");
        }
    }

    void addItem(String name, double price) {
        if(currentItemCount < capacity) {
            items[currentItemCount++] = new Item(name, price, 1);
        } else {
            System.out.println("Cart is full!");
        }
    }

    void getCartItems() {
        for (int i = 0; i < currentItemCount; i++) {
            items[i].getItem();
        }
    }

    double calculateTotal() {
        double result = 0;
        for (int i = 0; i < currentItemCount; i++) {
            result += (items[i].price * items[i].qty);
        }
        return result;
    }
}

public class Task1 {
    public static void main(String[] args) {
        Item[] items = new Item[10];

        items[0] = new Item("item 1", 10, 2);
        items[1] = new Item("item 2", 10, 7);
        items[2] = new Item("item 3", 10, 3);
        items[3] = new Item("item 4", 10, 1);
        items[4] = new Item("item 5", 10, 1);
        items[5] = new Item("item 6", 10, 1);
        items[6] = new Item("item 7", 10, 1);
        items[7] = new Item("item 8", 10, 1);
        items[8] = new Item("item 9", 10, 8);
        items[9] = new Item("item 10", 10, 2);

        // ShoppingCart cart = new ShoppingCart(items);
        // cart.getCartItems();

        ShoppingCart cart = new ShoppingCart(10);
        cart.addItem(items[1]);
        cart.addItem(items[2]);

        cart.addItem("item 25", 10,9);
        cart.addItem("item 25", 10);

        cart.getCartItems();
        System.out.println("Total: " + cart.calculateTotal());

    }
}
