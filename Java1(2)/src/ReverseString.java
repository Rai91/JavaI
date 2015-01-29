/**
 * Created by rari on 29-01-2015.
 */
import java.util.*;

class ReverseString
{
    public static void main(String args[])
    {
        String original, reverse = " ";
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string or a word that you want to reverse");
        original = in.nextLine();

        int length = original.length();

        for ( int i = length - 1 ; i >= 0 ; i-- )
            reverse = reverse + original.charAt(i);

        System.out.println("Reverse of entered string is: "+reverse);
    }
}
