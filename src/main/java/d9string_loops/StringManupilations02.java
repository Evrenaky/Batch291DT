package d9string_loops;

public class StringManupilations02 {
    public static void main(String[] args) {

        //Ornek 1: Bir String'deki tekrarsiz character'leri ekrana yan yana yazdiriniz.
        // yusuf ==> ysf

        //Example 1: Print the non-repeated characters in a String side by side on the screen.
        String s = "yusuf";

        //indexOf("u")      ==> 1 indexOf ve lastIndexOf farki ise tekrarli
        //lastIndexOf("u")  ==> 3

        //indexOf("y")      ==> 0 indexOf ve lastIndexOf ayni tekrarsiz
        //lastIndexOf("y")  ==> 0

        //lastIndexOf() method’u spesifik bir karakterin son gorunumunun index’ini verir
        //Bu method olmayan karakterler icin -1 verir

        if (s.indexOf("y") == s.lastIndexOf("y")) {
            System.out.print("y");
        }

        if (s.indexOf("u") == s.lastIndexOf("u")) {
            System.out.print("u");
        }

        if (s.indexOf("s") == s.lastIndexOf("s")) {
            System.out.print("s");
        }

        if (s.indexOf("f") == s.lastIndexOf("f")) {
            System.out.print("f");
        }

        System.out.println();//otomatik alt satira gecirir karismasin diye yapilir
        //------------------------------
        //Ornek 2: Bir banka kartının son 4 hanesi hariç tüm hanelerini '*' kullanarak görünmez yapın
        //           1234 6789 1234 6789 ==> **** **** **** 6789
        
        //Example 2: Make all but the last 4 digits of a bank card invisible using '*'
        
        String cardNum = "1234 6789 1234 6789";
        String first = cardNum.substring(0,15).replaceAll("[0-9]","*");
        System.out.println("first = " + first);
        
        String last = cardNum.substring(15);
        System.out.println("last = " + last);
        
        String result1 = first + last;
        System.out.println("result1 = " + result1); //**** **** **** 6789
        
        //2.yol
        String result2 = first.concat(last);
        System.out.println("result2 = " + result2);
        
        


    }
}
