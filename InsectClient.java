public class InsectClient {
    public static void main(String[] args) {
        System.out.println(Insect.produceRandomFact());
        Insect bugNew = new Insect(13, 31, 0);
        bugNew.weight = 99;
    }
}
