import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("List of operations: add subtract multiply divide alphabetize");
        System.out.println("Enter an operation:");
        String operation = input.next();
        System.out.println(operation);
        if (operation.equals("add")) {
            System.out.println("You printed ");

            int int1, int2;

            System.out.println("Enter two integers:");
            int1 = input.nextInt();
            int2 = input.nextInt();
            System.out.println("You printed " + int1 + " " + int2);
        }

    }
}
