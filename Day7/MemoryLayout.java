package Day7;

class StackHeap {

    String name;

    StackHeap(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name);
    }
}

public class MemoryLayout {

    public static void main(String[] args) {

        int age = 20;

        StackHeap s = new StackHeap("Afsiya");

        System.out.println(age);

        s.display();

    }
}