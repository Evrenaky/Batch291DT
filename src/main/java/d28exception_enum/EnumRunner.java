package d28exception_enum;

import java.util.Arrays;
import java.util.Scanner;

public class EnumRunner {
    public static void main(String[] args) {
        // Cities c = new Cities();// HATA enumdan ibject uretemezsiniz

        //1- Enum daki bir sabite nasil ulasabiliriz?

        Cities il = Cities.AKSARAY;
        System.out.println(il);//AKSARAY

        String ilIsmi = Cities.BURSA.getCityName();
        System.out.println(ilIsmi);//Bursa

        //3- Ankara’nin posta koduna ulasalim

        String postaKodu = Cities.ANKARA.getPostalCode();
        System.out.println(postaKodu);//06000

        //4- Antalya’nin plaka koduna ulasalim

        int plaka = Cities.ANTALYA.getPlateCode();
        System.out.println(plaka);//7

        //5- Kullanicidan bir ilin plaka kodunu alarak bunun hangi il oldugunu console a yazdirin
        //values() methodu enum icindeki tum datalari bir Array icinde bize verir
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen pLaka kodu giriniz");
        int plk = input.nextInt();

        Cities[] sehirler = Cities.values();
        //System.out.println(Arrays.toString(sehirler));
        //Bir ENUM dogrudan donguye sokabilirmiyiz

        if (plk<1||plk>81){
            System.out.println("Lutfen 1 ile 81 arasi bir plaka kodu giriniz");
        }else {
            for (Cities w : sehirler){
                if (plk==w.getPlateCode()){
                    System.out.println("Girdiginiz plaka : "+w.getCityName()+ " iline aittir");
                    break;
                }
            }
        }


    }




}
