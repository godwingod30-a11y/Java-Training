package Day7;

class Car {

    String brand = "BMW";

    void start() {
        System.out.println("Car Started");
    }

}

public class OOPS {

    public static void main(String[] args) {

        Car c = new Car();

        System.out.println(c.brand);

        c.start();

    }
}