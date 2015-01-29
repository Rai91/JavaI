/**
 * Created by rari on 28-01-2015.
 */
public class DoubleFor{

    public static void main (String[] args) {

        int x,y;

        for (x = 0; x < 10; x++) {

            for (y = 0; y < 10; y++) {

                System.out.print(x + " " + y);

                if (x == 9 && y == 9) {

                    System.out.println("Program is over");

                }

            }

        }

    }
}
