package Day7;

class Student {

    String name = "dinesh";

    void display(String name) {

        System.out.println("Parameter : " + name);

        System.out.println("Instance : " + this.name);

    }

}

public class Shadowing {

    public static void main(String[] args) {

        Student s = new Student();

        s.display("Godwin");

    }
}