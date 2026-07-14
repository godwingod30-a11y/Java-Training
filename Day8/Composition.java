package Day8;

class Engine {

    void start() {
        System.out.println("Engine Started");
    }

}

class Car {

    Engine engine = new Engine();

    void drive() {

        engine.start();

        System.out.println("Car is Running");

    }

}

public class Composition {

    public static void main(String[] args) {

        Car c = new Car();

        c.drive();

    }
}