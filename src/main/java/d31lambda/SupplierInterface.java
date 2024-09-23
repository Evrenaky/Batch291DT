package d31lambda;

import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {

        //Ornek: Rastgele sayi ureten bir method olusturunuz.
        //Example: Create a method that generates random numbers.

        Supplier<Double> randomSupplier = () -> Math.random();// ()  Lamda'da bir deger almadi anlamida kullanilir

        System.out.println("random number" + randomSupplier.get());

        Supplier<Integer> contantNumber = () -> 42123123;
        System.out.println(contantNumber.get());

    }//main disi
}
