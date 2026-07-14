package Day8;

class Student {

    String name;

    Student(String name) {
        this.name = name;
    }

}

class College {

    Student student;

    College(Student student) {
        this.student = student;
    }

    void display() {
        System.out.println(student.name);
    }

}

public class Aggregation {

    public static void main(String[] args) {

        Student s = new Student("godwin");

        College c = new College(s);

        c.display();

    }
}
