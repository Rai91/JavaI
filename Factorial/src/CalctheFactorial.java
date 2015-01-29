/**
 * Created by rari on 29-01-2015.
 */
import java.util.Scanner;

class CalctheFactorial
{
    public static void main(String args[])
    {
        int n, c, fact = 1;

        System.out.println("Enter an integer to calculate it's factorial, between 1-16:");
        Scanner in = new Scanner(System.in);

        n = in.nextInt();

        if ( n < 0 )
            System.out.println("Number should be bigger than 0 and smaller than 17.");
        else
        {
            for ( c = 1 ; c <= n ; c++ )
                fact = fact*c;

            System.out.println("Factorial of "+n+" is = "+fact);
        }
    }
}
