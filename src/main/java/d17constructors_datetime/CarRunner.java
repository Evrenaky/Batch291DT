package d17constructors_datetime;

public class CarRunner {

    public static void main(String[] args) {
        //4- Car class’indan bir object uretelim

        //9- Default Car() icine parametre girelim

        Car c1 = new Car("BMW","3.20",2024,false);
        System.out.println(c1.brand); //Cupra
        System.out.println(c1.model); //Formentor
        System.out.println(c1.year);  //2024
        System.out.println(c1.hybrid);//true

        c1.action();//Cupra Hizli hareket eder
        c1.stop();  //Cupra Abs ile Guvenli bir mesafede durur

        //5- Car class’a donup, constructor olusturalim

        //10- Baska bir object uretelim ve direkt objeyi yazdiralim
         Car c2 = new Car("Audi","A4",2023,false);
        System.out.println(c1);//referavce alindi
        System.out.println(c2);//referavce alindi

        //11- Reference durumunu duzeltmek icin Car class’a toString methodu ekleyelim
        //Java’da toString metodu genellikle bir nesnenin içeriğini okunabilir bir String olarak döndürmek için kullanılır.

        //16- Yeni bir object uretelim - SON
        Car c3 = new Car("Tofas","Sahin");
        System.out.println(c3);
    }
}
