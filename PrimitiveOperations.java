/* a
   e) Shifting focus, declare a `char` variable, and assign an uppercase letter to it. Print out this value.
   f) Using a *numerical operation*, change the letter to the same letter, but in lowercase. Use a numerical operation - do not reassign the variable.
      You may want to review a [table of ASCII values](https://ascii.cl/) as you're working on this section. Print out the new `char` value.
      **Hint:** you'll likely have to use casting to get this to work.
*/

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

        char myChar = 'A';
        

    }
}
