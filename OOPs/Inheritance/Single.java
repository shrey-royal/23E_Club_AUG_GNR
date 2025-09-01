class Parent {
    protected int parentData;

    Parent(int data) {
        this.parentData = data;
    }

    protected int getParentData() {
        return parentData;
    }
}

class Child extends Parent {
    Child() {
        super(23);    //calling parent class' constructor
    }

    void printData() {
        System.out.println("Parent Data: " + super.getParentData());
        System.out.println(super.parentData);
    }
}

public class Single {
    public static void main(String[] args) {
        Child c = new Child();

        c.printData();
    }
}
