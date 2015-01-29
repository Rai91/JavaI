/**
 * Created by rari on 28-01-2015.
 */
public class StringFor {

    public static void main(String args[]){
        int [] numbers = {10, 20, 30, 40, 50, 60, 70};

        for(int x : numbers ){
            System.out.print( x );
            System.out.print(",");
        }
        System.out.print("\n");
        String [] names ={"James", "Larry", "Tom", "Lacy", "Abel", "Raimon"};
        for( String name : names ) {
            System.out.print( name );
            System.out.print(",");
        }
    }
}