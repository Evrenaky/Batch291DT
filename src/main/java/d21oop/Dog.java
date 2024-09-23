package d21oop;

public class Dog extends Mammal {

    public void bark() {
        System.out.println("Dogs bark...");

    }

    @Override//Anonation
    public void eat() {
        System.out.println("Dogs eat...");
    }

    @Override
    public Animal create() {
        return new Dog();// Upcasting-Java bunu otomatik yapar ''yukarinin kalibina dok',
        // child parent'nin data tipini kullanabilir
        //downcasting-Java otomatik yapmaz. islemedik
    }

    @Override
    public int add(int a, int b) {
        //primitive'ler arasinda parents child iliskisi yoktur
        //Primitive'lerde return type degistirilemez
        return a + b;
    }

    @Override
    public Integer multiply(Integer a, Integer b) {
        return a * b;
    }

    //Herkes cat claas'ta feedWeedMilk methodunu override etsin
}
