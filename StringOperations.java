//*******************************************************************
//  GA Tech 1331 HW01
//
//
//*******************************************************************

public class StringOperations {

    public static void main(String[] args) {
        String myName = "Scott Urista";
        System.out.println(myName);

        String firstLetter = myName.replace('S', 'A');
        String lastLetter = firstLetter.replace('a', 'Z');
        System.out.println(lastLetter);

        String myUrl = "www.gatech.edu";
        String urlName = myUrl.substring(4, 10);
        String my1331 = "1331";
        String solUrl = urlName.concat(my1331);
        System.out.println(solUrl);
    }
}
