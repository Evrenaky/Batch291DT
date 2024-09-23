package d28exception_enum;

public class ExceptionRunner {
    public static void main(String[] args) {

     sudentGrade(-55);



    }//main disi
    public static void sudentGrade(int not){
        //System.out.println(not);
        if (not<0||not>100){
            try {
                throw new InvalidStudentGradeException("ogrenci notu sifirdan dan kucuk veya yuzden buyuk girilimez");
            } catch (InvalidStudentGradeException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println(not);
        }
    }
}
