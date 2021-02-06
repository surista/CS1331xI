import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("List of operations: add subtract multiply divide alphabetize");
        System.out.println("Enter an operation:");
        String operation = input.next().toLowerCase();
        int int1, int2, intSol;
        double myDouble1, myDouble2, douSol;
        String myString1, myString2;


        switch (operation) {
            case "add":
                System.out.println("Enter two integers:");
                if (!input.hasNextInt()) {
                    System.out.println("Invalid input entered. Terminating...");
                    break;
                }
                int1 = input.nextInt();
                int2 = input.nextInt();
                intSol = int1 + int2;
                System.out.println("Answer: " + intSol);
                break;
            case "subtract":
                System.out.println("Enter two integers:");
                if (!input.hasNextInt()) {
                    System.out.println("Invalid input entered. Terminating...");
                    break;
                }
                int1 = input.nextInt();
                int2 = input.nextInt();
                intSol = int1 - int2;
                System.out.println("Answer: " + intSol);
                break;
            case "multiply":
                System.out.println("Enter two doubles:");
                if (!input.hasNextDouble()) {
                    System.out.println("Invalid input entered. Terminating...");
                    break;
                }
                myDouble1 = input.nextDouble();
                myDouble2 = input.nextDouble();
                douSol = myDouble1 * myDouble2;
                System.out.printf("Answer: %.2f\n", douSol);
                break;
            case "divide":
                System.out.println("Enter two doubles:");
                if (!input.hasNextDouble()) {
                    System.out.println("Invalid input entered. Terminating...");
                    break;
                }
                myDouble1 = input.nextDouble();
                myDouble2 = input.nextDouble();
                if (myDouble2 == 0) {
                    System.out.println("Invalid input entered. Terminating...");
                    break;
                } else {
                    douSol = myDouble1 / myDouble2;
                    System.out.printf("Answer: %.2f\n", douSol);
                    break;
                }
            case "alphabetize":
                System.out.println("Enter two words:");
                myString1 = input.next();
                myString2 = input.next();
                if (myString1.toLowerCase().compareTo(myString2.toLowerCase()) < 0) {
                    System.out.printf("Answer: %s comes before %s alphabetically.\n", myString1, myString2);
                    break;
                } else if (myString1.toLowerCase().compareTo(myString2.toLowerCase()) > 0) {
                    System.out.printf("Answer: %s comes before %s alphabetically.\n", myString2, myString1);
                    break;
                } else {
                    System.out.println("Answer: Chicken or Egg.\n");
                    break;
                }
            default:
                System.out.println("Invalid input entered. Terminating...\n");
                break;
        }
    }
}
