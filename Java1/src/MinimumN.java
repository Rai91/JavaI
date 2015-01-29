/**
 * Created by rari on 28-01-2015.
 */


import java.io.Console;
import java.util.Scanner;

class MinimumN {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int d = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce 3 numbers for get the minimum: ");
        int num = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        if ( num < num2 && num < num3 )
            System.out.println("First number is the minimum." + num);
        else if ( num2 < num && num2 < num3 )
            System.out.println("Second number is the minimum." + num2);
        else if ( num3 < num && num3 < num2 )
            System.out.println("Third number is the minimum." + num3);
        else
            System.out.println("Entered numbers are not distinct.");


    }

}