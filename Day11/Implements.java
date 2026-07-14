package Day11;

interface Animal {

    void sound();

}

class Dog implements Animal {

    public void sound() {
        System.out.println("Dog Barks");
    }

}

public class Implements {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();

    }
}