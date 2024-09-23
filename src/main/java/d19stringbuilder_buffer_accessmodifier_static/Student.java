package d19stringbuilder_buffer_accessmodifier_static;

public class Student {

   /* Access Modifier (Erişim Belirleyici)

   1)public
   2)protected
   3)default
   4)private

   public > protected > default > private

   public      ==> public olanlar her class'dan kullanilabilir
   protected   ==> protected olanlar baska package'lardan kullanilamaz,
                ancak baska package'larda child classlar icinden kullanilabilir
   default     ==> default olanlar baska package'lardan kullanilamazlar
   private     ==> private olanlar sadece olusturulduklari class icinden kullanilabilirler

   Soru: "protected ile default" arasindaki farki söyleyiniz?
   Cevap: protected olanlar baska package'lardan kullanilamaz ancak baska package'larda
   child classlar icinden kullanilabilir. default olanlar baska package'lardan kullanilamazlar
   */

    public String stdNmame = "Ali Can";
    protected String address = "Istanbul";
    String email = "alican@gmail.com"; // Hicbirse sey yazmazsak default olur
    private String tcKimlik = "123467878765";

    /*@Override
    public String toString() {
        return "Student{" +
                "stdNmame='" + stdNmame + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", tcKimlik='" + tcKimlik + '\'' +
                '}';*/
    }
