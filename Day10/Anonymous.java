package Day10;

interface Animal {

    void sound();

}

public class Anonymous {

    public static void main(String[] args) {

        Animal a = new Animal() {

            public void sound() {
                System.out.println("Dog Barks");
            }

        };

        a.sound();

    }
}