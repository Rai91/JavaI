/**
 * Created by rari on 29-01-2015.
 */
public class ForContBreak {

    public static void main(String args[]) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int x : numbers) {
            if (x == 30) {
                continue;
            }
            if (x == 40) {
                break;
            }

            System.out.print("Result is variable " + x);
            System.out.print("\n");

        }
    }
}

