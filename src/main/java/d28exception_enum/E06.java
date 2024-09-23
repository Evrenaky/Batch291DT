package d28exception_enum;

public class E06 {
    public static void main(String[] args) {

        //5) NullPointerException:(bos isaretcisi) Null degerindeki bir variable referans olarak kullanildiginda olusur
        String s = "Java";
        numberOfChar(s);//4

        String t = "";
        numberOfChar(t);//0

        String u = null;
        numberOfChar(u); //Hata


    }//main disi

    public static void numberOfChar(String s) {

        try {
            int a = s.length();
            System.out.println(a);
        } catch (NullPointerException e) {
            System.out.println("null degeeri ile leght() methodunu kullanmayiniz");
        }


    }


}
