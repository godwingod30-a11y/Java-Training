package Day12;

public class Throwexception {

    public static void main(String[] args) {

        try {

            throw new Exception("This is a custom exception");

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }
}