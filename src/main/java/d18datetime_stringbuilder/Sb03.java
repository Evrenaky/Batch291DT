package d18datetime_stringbuilder;

public class Sb03 {
    public static void main(String[] args) {

        //1-reverse(): StringBuilder Object’inin içeriğini ters çevirir.String class’ta yoktur

        StringBuilder sb1 = new StringBuilder("Karamel kapli gofret");
        System.out.println(sb1); //Karamel kapli gofret
        sb1.reverse();
        System.out.println(sb1); //terfog ilpak lemaraK

        //--------------------------------
        //2- deleteCharAt(int index): Belirtilen konumda(index’te) bulunan karakteri siler.
        sb1.deleteCharAt(1);//terfog ilpak lemaraK
        System.out.println(sb1);  //trfog ilpak lemaraK

        //------------------------
        //3- delete(int start - dahil , int end - haric): Belirtilen aralıktaki karakterleri siler.
        sb1.delete(5,11); //trfog ilpak lemaraK
        System.out.println(sb1);//trfog lemaraK

        //--------------------------
        //4-replace(int start-dahil, int end-haric, String str):
        // Belirtilen indexteki karakterleri verilen stringle değiştirir.
        sb1.replace(0,5,"Taze");
        System.out.println(sb1);//Taze lemaraK

        //-----------------------
        //5-insert(int offset, String str): Belirtilen konumdan itibaren verilen stringi ekler.
        // Buradaki offset, eklemenin başlayacağı konumu belirtir ve aslında bir index görevi görür.

        sb1.insert(2,"citir");
        System.out.println(sb1);//Tacitirze lemaraK ekleme yapar ustune yazmaz

        //------------------------------
        //6-compareTo() metodunun görevi, iki StringBuilder Objesini karşılaştırmaktır.
        // int değeri döndürür.Sozluk gibidir.Eğer iki StringBuilder nesnesi birbirine eşitse, 0 döndürür.
        // Eğer birinci StringBuilder nesnesi ikinci StringBuilder nesnesinden önce geliyorsa, negatif deger döndürür.
        // Eğer birinci StringBuilder nesnesi ikinci StringBuilder nesnesinden sonra geliyorsa, pozitif deger döndürür.
        // Farkli olan iki harfin ascii kodlari arasindaki farki verir.
        // Ornegin; Bu sifir ve birler if'ler icerisinde kullanilarak iki Object arasindaki iliski belirlenmis olur.
        // Kelimelerin sözlük sıralamasını belirleyebilirsiniz, kelimeleri alfabetik sıraya göre sıralayabilirsiniz.










    }
}
