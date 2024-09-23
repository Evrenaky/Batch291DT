package d20staticblock_instanceblock_oop;

public class InstanceBlock3Runner {
    public static void main(String[] args) {

        InstanceBlock3 car1 = new InstanceBlock3();//Rengi : Siyah Yakit Tipi : Benzin

        InstanceBlock3 car2 = new InstanceBlock3();//Rengi : Siyah Yakit Tipi : Benzin


        //Ancak costructorlarla ozellestirilebilir
        InstanceBlock3 car3 = new InstanceBlock3("Kirmizi","Dizel");//Rengi : Siyah Yakit Tipi : Benzin
        System.out.println("Rengi :"+ car3.color);
        System.out.println("Yakit Tipi :"+ car3.fuelType);

        InstanceBlock3 car4 = new InstanceBlock3();//Rengi : Siyah Yakit Tipi : Benzin









    }
}
