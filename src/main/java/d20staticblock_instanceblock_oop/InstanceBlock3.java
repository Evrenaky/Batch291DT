package d20staticblock_instanceblock_oop;

public class InstanceBlock3 {

    //Ornek 3: Bir araba fabrikasinda her araba siyah renkli ve yakit tipi benzin olsun.
    //Example 3: In a car factory, each car is black in colour and the fuel type is petrol.

    //(Bunlar ortak ozellikler. Digerleri sonra ayarlansin)

    public String color;
    public String fuelType;


    //-------------------------------------------------------------------
    //Instance block-bu class'tan her obje uretildiginde burasi calisir
    {
        color="Siyah";
        fuelType="Benzin";
    }
    //-------------------------------------------------------------------
    //constuctor - Classín objeleri olusturuldugunda calisir


    public InstanceBlock3() {
        System.out.println("Rengi : "+color);
        System.out.println("Yakit Tipi : "+fuelType);
    }
    //Default olarak siyah ve benzinle baslatmak istemezsek parametreli constructor olustururuz
    public InstanceBlock3(String color, String fuelType) {
        this.color = color;
        this.fuelType = fuelType;
    }


}
