package Day11;

interface Animal1 {

    void eat();

}

interface Dog1 extends Animal1 {

    void bark();

}

class Puppy implements Dog1 {

    public void eat() {
        System.out.println("Eating");
    }

    public void bark() {
        System.out.println("Barking");
    }

}

public class InterfaceExtends {

    public static void main(String[] args) {

        Puppy p = new Puppy();

        p.eat();
        p.bark();

    }
}