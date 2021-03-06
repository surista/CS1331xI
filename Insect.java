public class Insect {
    private double weight;
    private int x;
    private int y;

    private static final double DIST_WEIGHT_LOSS_FACTOR = 0.0001;
    private static int population = 0;

    private static final String[] FACTS = {
            "The two main groups of insects are winged and wingless",
            "Ther are more than 1 million insects species",
            "An ant's tongue is 8 inches long",
            "Spiders are not considered insects"
    };

    //constructor
    public Insect(double initWeight, int initX, int initY) {
        weight = initWeight;
        x = initX;
        y = initY;
        population++;
    }

    public void eat(double amount) {
        System.out.println("Nibble Nibble");
        weight += amount;
    }

    public void move(int newX, int newY) {
        double distance = calculateDistance(x, y, newX, newY);
        if (distance > 0) {
            x = newX;
            y = newY;
            weight *= DIST_WEIGHT_LOSS_FACTOR * distance;
            System.out.printf("Moved %.2f units\n", distance);
        } else System.out.println("Staying put");
    }


    private static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }


    public static String produceRandomFact() {
        int index = (int) (Math.random() * ((FACTS.length - 1) + 1));
        return FACTS[index];
    }

    // test method
    public static void main(String[] args) {
        System.out.printf("Insect population: %d\n", population);
        Insect buzz3 = new Insect(10, 100, 90);
        Insect buzz4 = new Insect(9.5, -300, 400);
        System.out.printf("Insect population: %d\n", population);
        buzz3.move(1, 10);
        buzz4.move(-300, 400);
        System.out.println(Insect.DIST_WEIGHT_LOSS_FACTOR);
        System.out.printf("Insect population: %d\n", population);
        System.out.println(produceRandomFact());
    }
}


