/**
 * Created by rari on 29-01-2015.
 */
import java.util.*;

class RandomN {
    public static void main(String[] args) {

        int a;
        Random t = new Random();

        // Will show 10 different random numbers between 1-1000.

        for (a = 1; a <= 10; a++) {
            System.out.println(t.nextInt(1000));
        }
    }
}
