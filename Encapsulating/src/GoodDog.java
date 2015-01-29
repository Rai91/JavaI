import java.io.Console;
import java.util.Scanner;


public class GoodDog {
    private int size;

    public int getSize(){

        return size;
    }

    public void setSize(int s){

        size = s;
    }

    void bark(){
        if(size>60){
            System.out.println("Woof");}
        else if(size>14){
            System.out.println("Ruff");}
        else{
            System.out.println("Yip");
        }
    }
}

class GoodDogTestDrive {

    public static void main (String[] args){

        Scanner one = new Scanner(System.in);
        System.out.println("Introduce number:");
        int num = one.nextInt();

        Scanner two = new Scanner(System.in);
        System.out.println("Introduce number2:");
        int num2 = two.nextInt();

        GoodDog One = new GoodDog();
        One.setSize(num);
        GoodDog Two = new GoodDog();
        Two.setSize(num2);
        System.out.println("Dog one: " + One.getSize());
        System.out.println("Dog two: " + Two.getSize());
        One.bark();
        Two.bark();

    }
}

