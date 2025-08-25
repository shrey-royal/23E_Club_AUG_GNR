class Student {
    int id;
    String name;
    int grade;
    float marks;
    String city;

    Student() {
        id = 0;
        name = "";
        grade = 0;
        marks = 0;
        city = "";
    }

    Student(int id, String name, int grade, float marks, String city) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.marks = marks;
        this.city = city;
    }

    void printStudentDetails() {
        System.out.println("========================");
        System.out.println("Id: " + id + "\nName: " + name + "\nGrade: " + grade + "\nMarks: " + marks + "\nCity: " + city);
        System.out.println("========================");
    }
}

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.printStudentDetails();

        Student s2 = new Student(101, "Yashvi Patel", 4, 100, "Gandhinagar");
        s2.printStudentDetails();
    }
}

// Chocolate - name, price