package d17constructors_datetime;

import java.time.LocalDate;
import java.time.Period;

public class DateTime05 {
    public static void main(String[] args) {

        //ornek 2: Verilen iki tarih arasindaki farki hesaplayan kodu yaziniz.
        //example 2: Write the code that calculates the difference between two given dates.

        //Java'da Period class'i, tarihler arasındaki yıl, ay ve gün farklarını temsil etmek için kullanılır.
        //Bu sınıf, iki LocalDate nesnesi arasındaki zaman farkını ifade eder ve java.time paketi içinde yer alır.
        //Period sınıfı, tarihler arasındaki farkları kolayca yönetmek ve manipüle etmek için çeşitli metodlar sağlar.

        //Kullanım Alanları
        //Period sınıfı, özellikle tarihler arasındaki uzun süreli farkları hesaplamak, tarihleri manipüle etmek
        //veya tarihler arası geçiş sürelerini yönetmek için kullanışlıdır. Finans, sağlık, eğitim gibi alanlarda
        //ve tarih ile ilgili işlemlerin sık yapıldığı her türlü yazılım geliştirme projelerinde etkili bir araçtır.

        //Period.between() metodu, iki tarih arasındaki farkı hesaplamak için kullanılır.
        //Bu metod, başlangıç ve bitiş tarihleri arasındaki tam yıl, ay ve gün farkını bir Period nesnesi olarak döndürür.

        LocalDate date1 = LocalDate.of(2024, 10, 2);
        LocalDate date2 = LocalDate.of(1981, 8, 2);

        Period difference = Period.between(date2, date1);
        System.out.println(difference);

        //Ayri ayri gorelim
        int yearDifference = difference.getYears();
        int monthDifference = difference.getMonths();
        int dayDifference = difference.getDays();

        System.out.println(date1 + " ve " + date2 + " arasindaki fark : ");
        System.out.println("Yil : " + yearDifference)
        ;System.out.println("Ay : " + monthDifference)
        ;System.out.println("Gun : " + dayDifference);

        //Instant
        //ZoneDateTime
        //Duration
        //Clock


    }
}
