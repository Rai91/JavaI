/**
 * Created by rari on 29-01-2015.
 */
import java.util.*;
import java.io.*;

class FirstRuntimeApp {
    public static void main(String[] args) {
        Runtime rs = Runtime.getRuntime();

        try {
            rs.exec("notepad");

        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}