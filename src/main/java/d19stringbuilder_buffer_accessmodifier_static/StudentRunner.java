package d19stringbuilder_buffer_accessmodifier_static;

public class StudentRunner {
    public static void main(String[] args) {

    //Student Class'tan bir instance obje olusturalim
        Student ali = new Student();

        System.out.println(ali.stdNmame);//Ali Can
        System.out.println(ali.email);//alican@gmail.com
        System.out.println(ali.address);//Istanbul
        //tcKimlik'e baska clas'tan ulasilamaz cunku private
        System.out.println(ali);

    }


}
