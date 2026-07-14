package Day16;

interface Animal {

    default void sound() {

        System.out.println("Animal Sound");

    }

}

class Dog implements Animal {

}

public class DefaultMethod {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();

    }

}