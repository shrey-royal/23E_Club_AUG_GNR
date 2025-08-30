class Paint {
    String colorName;

    Paint() {
        this("black");  //calling parameterized constructor
        System.out.println("Default constructor called");
    }

    Paint(String colorName) {
        this.colorName = colorName;
        System.out.println("Parameterized Constructor called");
    }
}

public class ThisKW {
    public static void main(String[] args) {
        Paint p = new Paint();
        Paint p1 = new Paint("Blue");

        System.out.println(p.colorName);
        System.out.println(p1.colorName);
    }
}
