package d22oop;

public abstract class Honda {

    /*
    4- Abstraction(Soyut)
    Abstraction iki bolumden olusur.
    i) Abstract Class:
    Kendisinden object olusturulmaz. Bazi class'lari obje olusturmak amaciyla degil,
    objeleri gruplara ayirmak ve genel ozellikleri belirlemek icin olustururuz.
    Baslangic degil, sonuctur. Cünkü bu sınıflar belirli bir nesne grubunu temsil eder ve
    bu gruptaki tüm nesneler için ortak olan özellikleri belirler.
    */
    //===================================================
     /*
    1)Abstract method'larin body'si olmaz.Size ne yaptigini soyler,nasil yaptigini soylemez.
    2)Body'si olan method'lara 'non-abstract' veya 'concrete' (somut) method denir
    3)Abstract method'lar tum child class'lar tarafindan override edilmelidir yani kullanilmalidir.
    4)Abstract method'lar ancak abstract class'lar icinde olusturulabilir.
    5)Abstract class'lar hem 'abstract method' hem de 'concrete method' icerebilirler.
    6)Concrete method'lar child class'lar tarafindan istenirse override edilebilirler
    */
     /*
    1)Abstract method'larin body'si olmaz.Size ne yaptigini soyler,nasil yaptigini soylemez.
    2)Body'si olan method'lara 'non-abstract' veya 'concrete' (somut) method denir
    3)Abstract method'lar tum child class'lar tarafindan override edilmelidir yani kullanilmalidir.
    4)Abstract method'lar ancak abstract class'lar icinde olusturulabilir.
    5)Abstract class'lar hem 'abstract method' hem de 'concrete method' icerebilirler.
    6)Concrete method'lar child class'lar tarafindan istenirse override edilebilirler
    */
    //==============================================================

    public void music(){
        System.out.println("Pro");
    }

    public abstract void engine();





}
