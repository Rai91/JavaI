package com.company;

public class Main {

    public static void main(String[] args) {

        int beerNum = 50;
        String word = "bottles";
        while (beerNum > 0) {
            if (beerNum == 1) {
                word = "bottle";
            }
            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println("Take one down. ");
            System.out.println("Pass it around. ");
            beerNum--;

            if (beerNum == 0) {
                System.out.println("No more bottles of beer on the wall");


            }
        }
    }
}

