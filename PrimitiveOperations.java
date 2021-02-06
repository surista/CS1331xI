//*******************************************************************
//  GA Tech 1331 HW01
//
//
//*******************************************************************

public class PrimitiveOperations {

    public static void main(String[] args) {
        int myInt = 5;
        double myDouble = 3.5;

        System.out.println(myInt);
        System.out.println(myDouble);

        double multipled = myInt * myDouble;
        System.out.println(multipled);

        float newFloat = (float) myInt;
        System.out.println(newFloat);

        int newInt = (int) myDouble;
        System.out.println(newInt);

        char myChar = 'B';
        System.out.println(myChar);
        System.out.println((char) (myChar + 32));


    }
}
