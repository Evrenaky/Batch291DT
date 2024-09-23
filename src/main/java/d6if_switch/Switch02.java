package d6if_switch;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {

        /*Ornek 1: Ay numarasini soyleyince, numarasi verilen ay'dan baslayip
        12.aya kadar tum aylarin isimlerini yazdiran kodu yaziniz.
        8 ==> Agustos - Eylul - Ekim - Kasim - Aralik
        */

        /*Example 1: Write the code that prints the names of all the months starting from
        the given month number until the 12th month when the month number is given.
        8 ==> August - September - October - November - December
        */

        /*Not : switch condition parantezi icine 1) String 2) int 3) byte 4) short 5) char kullanabilirsiniz
        switch condition parantezi icine 1) long 2) boolean 3) float 4) double kullanilmaz */

        Scanner input = new Scanner(System.in);
        System.out.println("Baslangic ay sayisini giriniz");
        byte numOfMounth = input.nextByte();

        switch (numOfMounth) {
            case 1:
                System.out.println("january");
            case 2:
                System.out.println("february");
            case 3:
                System.out.println("march");
            case 4:
                System.out.println("april");
            case 5:
                System.out.println("may");
            case 6:
                System.out.println("june");
            case 7:
                System.out.println("july");
            case 8:
                System.out.println("august");
            case 9:
                System.out.println("september");
            case 10:
                System.out.println("october");
            case 11:
                System.out.println("nowember");
            case 12:
                System.out.println("december");
                break;
            default:
                System.out.println("Gecerli bir ay girin");

        }


    }
}
