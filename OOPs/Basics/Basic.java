import java.util.Scanner;

class Student {
    int id;
    String name;
    int grade;
    float marks;
    String city;

    void scanStudentDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter grade: ");
        grade = sc.nextInt();
        System.out.print("Enter marks: ");
        marks = sc.nextFloat();
        sc.nextLine();
        System.out.print("Enter city: ");
        city = sc.nextLine();

        sc.close();
    }

    void printStudentDetails() {
        System.out.println("========================");
        System.out.println("Id: " + id + "\nName: " + name + "\nGrade: " + grade + "\nMarks: " + marks + "\nCity: " + city);
        System.out.println("========================");
    }
}

public class Basic {
    public static void main(String[] args) {
        Student s = new Student();

        s.scanStudentDetails();
        s.printStudentDetails();
    }
}
