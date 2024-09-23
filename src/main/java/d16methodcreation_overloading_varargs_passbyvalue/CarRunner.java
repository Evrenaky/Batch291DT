package d16methodcreation_overloading_varargs_passbyvalue;

public class CarRunner {

    public static void main(String[] args) {
        //4- Car class’indan bir object uretelim

        Car c1 = new Car();
        System.out.println(c1.brand); //Cupra
        System.out.println(c1.model); //Formentor
        System.out.println(c1.year);  //2024
        System.out.println(c1.hybrid);//true

        c1.action();//Cupra Hizli hareket eder
        c1.stop();  //Cupra Abs ile Guvenli bir mesafede durur

        //5- Car class’a donup, constructor olusturalim


    }
}
