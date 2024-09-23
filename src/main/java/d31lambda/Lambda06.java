package d31lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda06 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("AliX");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");

       // removeIfLengthGreaterThanFive(myList);//[Ali, Elif, Yusuf, Elif]
       //removeIfElementsStartsWithZorEndsWithf1(myList); //[Ali, Mustafa]
       //removeIfElementsStartsWithZorEndsWithf2(myList); //[Ali, Mustafa]
        removeIfElementsContainsX(myList); //[Elif, Yusuf, Elif, Zeynep, Mustafa]


    }//main disi

    //1) Karakter sayisi 5'ten fazla olan elemanları silen bir method oluşturun.
    //1) Create a method that deletes elements with more than 5 characters.

    public static void removeIfLengthGreaterThanFive (List<String>myList){

        //removeIf() metodu, koleksiyonlardaki (özellikle List, Set gibi) elemanları belirli bir koşula göre
        // kaldırmak için kullanılır.removeIf metodu Collection arayüzünde tanımlıdır,
        // stream kullanilmadan cagirilir

        myList.
                removeIf(t-> t.length()>5);
        System.out.println(myList);

        //---------------------------------------------------------
        //2) ‘Z’ ile başlayan yada ‘f’ ile biten elemanları silen bir method oluşturun.
        //2) Create a method that deletes elements that start with ‘Z’ or end with ‘f’.


    }

    //-----------------------------------------------
    //2) ‘Z’ ile başlayan yada ‘f’ ile biten elemanları silen bir method oluşturun.
    //2) Create a method that deletes elements that start with ‘Z’ or end with ‘f’.

    //1.yol
    public static void removeIfElementsStartsWithZorEndsWithf1 (List<String>myList){

        myList.removeIf(t-> t.charAt(0)=='Z'|| t.charAt(t.length()-1) =='f');
        System.out.println(myList);

    }

    //2.yol best practice
    public static void removeIfElementsStartsWithZorEndsWithf2 (List<String>myList){

        myList.removeIf(t-> t.startsWith("Z")||t.endsWith("f"));
        System.out.println(myList);

    }

    //---------------------------------
    //3 ) “X” karakteri iceren elemanları silen bir method oluşturun.
    //3 ) Create a method that deletes elements containing the “X” character.

    public static void removeIfElementsContainsX (List<String> myList) {

        myList.removeIf(t -> t.contains("X")); //contains iceriyorsa demek
        System.out.println(myList);

    }




}
