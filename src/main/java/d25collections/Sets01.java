package d25collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets01 {
    public static void main(String[] args) {

        //Interview Sorusu
        //Ornek 1 : Ogrenci email adreslerini natural order’da siralanmis olarak depolayiniz.
        //Interview Question
        //Example 1 : Store student email addresses in natural order.

        long t1 = System.nanoTime();
        //===========================================
        //1.yol yavas - her adimda siralama yapar

        TreeSet<String> emails = new TreeSet<>();
        emails.add("k@gmail.com");
        emails.add("a@gmail.com");
        emails.add("z@gmail.com");
        emails.add("l@gmail.com");
        emails.add("u@gmail.com");
        emails.add("p@gmail.com");
        emails.add("g@gmail.com");
        emails.add("b@gmail.com");
        emails.add("t@gmail.com");
        emails.add("x@gmail.com");
        System.out.println(emails);//[a@gmail.com, b@gmail.com, g@gmail.com, k@gmail.com, l@gmail.com, p@gmail.com, t@gmail.com, u@gmail.com, x@gmail.com, z@gmail.com]

        //TreeeSet'ler cok yavas, biraz hizlandirabili miyiz?
        //Elemanlari eklerken en hizli olandan (HashSet) yardim alalim.

        long t2 = System.nanoTime();
        //=============================
        //2.yol: daha hizli

        HashSet<String> emailHs = new HashSet<>();
        emailHs.add("k@gmail.com");
        emailHs.add("a@gmail.com");
        emailHs.add("z@gmail.com");
        emailHs.add("l@gmail.com");
        emailHs.add("u@gmail.com");
        emailHs.add("p@gmail.com");
        emailHs.add("g@gmail.com");
        emailHs.add("b@gmail.com");
        emailHs.add("t@gmail.com");
        emailHs.add("x@gmail.com");
        System.out.println(emailHs);//[b@gmail.com, k@gmail.com, g@gmail.com, t@gmail.com, x@gmail.com, p@gmail.com, z@gmail.com, u@gmail.com, a@gmail.com, l@gmail.com]

        //Bos bor TreeSet olusturup constructor'una HashSet'i aktaralim
        TreeSet<String> emailHsTs = new TreeSet<>(emailHs);
        System.out.println(emailHsTs);//[a@gmail.com, b@gmail.com, g@gmail.com, k@gmail.com, l@gmail.com, p@gmail.com, t@gmail.com, u@gmail.com, x@gmail.com, z@gmail.com]

        long t3 = System.nanoTime();

        System.out.println(t2 - t1);//TreeSet
        System.out.println(t3 - t2);//HashSet

    }
}
