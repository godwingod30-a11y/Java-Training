package Day12;

import java.util.Scanner;

public class InputException {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();

            System.out.println("Marks: " + marks);

        } catch (Exception e) {

            System.out.println("Invalid Input");

        } finally {

            sc.close();

        }
    }
}