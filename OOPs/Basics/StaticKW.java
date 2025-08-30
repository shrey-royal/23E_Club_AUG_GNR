class Student {
    int enroll;
    String name;
    static String college;

    static {
        /* Static block */
        college = "LDRP";
    }

    Student(int enroll, String name) {
        this.enroll = enroll;
        this.name = name;
    }

    void printStudent() {
        System.out.println("Enrollment No.: " + enroll);
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
        System.out.println("-------------------------------------");
    }
}

public class StaticKW {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Krish");
        Student s2 = new Student(102, "Yashvi");
        Student s3 = new Student(103, "Yug");

        s1.printStudent();
        Student.college = "VGEC";
        s2.printStudent();
        s3.printStudent();
    }
}

// Icecream(id, name, flavor, price) -> icecreamCount=10