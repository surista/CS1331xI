public class CommandDemo {
    public static void main(String[] args) {
        double sum = 0;
        for (String num : args) {
            sum += Double.parseDouble(num);
        }
        double average = (args.length > 0) ? (sum / args.length) : 0;

        System.out.printf("The average is: %.2f\n", average);

    }

}
