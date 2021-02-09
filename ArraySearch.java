public class ArraySearch {
    public static void main(String[] args) {
        String[] concept = {"abstraction", "polymorphism", "inheritance", "encapsulation"};

        System.out.println(searchStringArray("encapsulation", concept));
    }


    public static String searchStringArray(String target, String[] array) {
        String result = "not found";
        for (String item : array) {
            if (item.equals(target)) {
                result = "found " + target;
                break;
            }
        }
        return result;
    }

}
