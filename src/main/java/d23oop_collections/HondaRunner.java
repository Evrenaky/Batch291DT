package d23oop_collections;

public class HondaRunner {
    public static void main(String[] args) {

        // Honda h = new Honda();  Abstract classlardan object uretilemez.cunku siniflandirma icin uretildi

        Civic c = new Civic();
        c.engine();

        Accord a =new Accord();
        a.engine();//Gas 2.0 Turbo

        a.music(); //Pro

    }
}
