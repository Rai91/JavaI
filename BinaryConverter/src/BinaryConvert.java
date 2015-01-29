/**
 * Created by rari on 29-01-2015.
 */
import java.util.Scanner;

public class BinaryConvert {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce the number you would like to convert: ");
        int num = in.nextInt();

        System.out.println("Number "+ num + " converted to binary is equal to: " + toBinary(num));


    }


    public static String toBinary(int base10Num){
        boolean isNeg = base10Num < 0;
        base10Num = Math.abs(base10Num);
        String result = "";

        while(base10Num > 1){
            result = (base10Num % 2) + result;
            base10Num /= 2;
        }
        assert base10Num == 0 || base10Num == 1 : "value is not <= 1: " + base10Num;

        result = base10Num + result;
        assert all0sAnd1s(result);

        if( isNeg )
            result = "-" + result;
        return result;
    }


    public static boolean all0sAnd1s(String val){
        assert val != null : "Failed precondition all0sAnd1s. parameter cannot be null";
        boolean all = true;
        int i = 0;
        char c;

        while(all && i < val.length()){
            c = val.charAt(i);
            all = c == '0' || c == '1';
            i++;
        }
        return all;
    }
}

