class Calculator {
    public static void add(int a, int b) {
        System.out.println("(int, int): " + (a+b));
    }

    
    public static void add(int a, int b, int c) {
        System.out.println("(int, int, int): " + (a+b+c));
    }

    
    public static void add(float a, double b) {
        System.out.printf("(float, double): %.2f\n", a+b);
    }
}


public class MthdOverload {
    public static void main(String[] args) {
        Calculator.add(1, 78);
        Calculator.add(23.4f, 3.4);
        Calculator.add(23, 67, 10);
    }
}
