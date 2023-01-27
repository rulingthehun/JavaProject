package Utility;

import java.util.Scanner;

public class MyFunc {
    public static double yuvarla(double gelenSayi) {
        Scanner oku = new Scanner(System.in);
        //18.564124
        //Once yuzle carpsam = 1856.4124
        if (gelenSayi != Math.round(gelenSayi)) {
            System.out.print("Virgulden sonra kac haneli sayi olsun? = ");
            double sayi = oku.nextInt();
            gelenSayi *= Math.pow(10, sayi);
            gelenSayi = Math.round(gelenSayi); //1856
            //Tekrar 100'e bolsem = 18.56
            gelenSayi /= Math.pow(10, sayi);
        }
        return gelenSayi; //18.56
    }
    // TODO: Bu fonksiyona kac hane ondalikli kisim istedigini ekleyin

    public static void Bekle(int saniye){
        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
