public class DrawFigures {
    public static void main(String[] args) {
        drawBox();
        drawX();
        drawBox();
        drawRocket();
    }

    public static void drawBox() {
        System.out.println("+-------*");
        System.out.println("|       |");
        System.out.println("|       |");
        System.out.println("+-------+");
    }

    public static void drawRocket() {
        System.out.println("+------*");
        System.out.println("-United-");
        System.out.println("-States-");
        System.out.println("+-------+");
    }

    public static void drawX() {

        System.out.println("\\       /");
        System.out.println(" \\     / ");
        System.out.println("  \\   /   ");
        System.out.println("   \\ /    ");
        System.out.println("   / \\    ");
        System.out.println("  /   \\   ");
        System.out.println(" /     \\  ");
        System.out.println("/       \\ ");
    }
}
