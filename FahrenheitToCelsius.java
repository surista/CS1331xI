import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyDemo {
    public static void main(String[] args) {

        int items;
        double itemCost, total;

        Scanner input = new Scanner(System.in);  // read input from user
        System.out.print("Enter number of items: ");
        items = input.nextInt();
        System.out.print("Enter cost per item: ");
        itemCost = input.nextDouble();

        total = items * itemCost;

        System.out.println();

        System.out.println("Unformatted total: " + total);
        NumberFormat currencyFmt = NumberFormat.getCurrencyInstance(Locale.JAPAN);

        System.out.printf("Formatted Total: " + currencyFmt.format(total));
    }
}
