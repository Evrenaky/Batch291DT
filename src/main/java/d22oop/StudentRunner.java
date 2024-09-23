package d22oop;

public class StudentRunner {
    public static void main(String[] args) {

        Student s = new Student();
        System.out.println(s.name);//Ali Can

        System.out.println(s.getAge());
        System.out.println(s.isSuccessful());//true

        s.setAge(25);
        System.out.println(s.getAge());//25

        s.setSuccessful(false);
        System.out.println(s.isSuccessful());//false

        //ODEV: encapsulation da private ile gizlenen bir veri baska package’dan set method ile degistirilebilir mi?
        //Cevap;Encapsulation'ı sağlamak için private bir veri alanı, doğrudan başka bir package'dan erişilemez.
        // Ancak, set methodu public veya protected ise ve bu metoda erişim varsa,
        // başka bir package'dan bu set methodu aracılığıyla private veriyi değiştirebilirsin.




    }
}
