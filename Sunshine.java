public class Powers {
    public static void main(String[] args) {
        final int LIMIT = 40;
        for (int base = 2; base <= 10; base++) {
            System.out.println("Powers of " + base + " under " + LIMIT);
            for (int pow = 1; i < LIMIT; pow *= base) {
                System.out.println(pow);
            }
        }

    }
}
