package Gun32._03_Ornek;

import java.time.Month;

public class AylarMain {
    public static void main(String[] args) {
        Aylar ay = Aylar.AGUSTOS;
        //Ayin kac gun surudugu method gerekir
        //Ayin yazilisi method gerekir
        //Ayin gercek sira nosu method gerekir
        //Java diyor ki: Bu sekilde tek bir kelime veya
        //sayi olan degerleri olacaksa sana bir kolaylik

        System.out.println("ay = " + ay);
        System.out.println("ay.ayNo = " + ay.ayNo);
        System.out.println("ay.gunMiktari = " + ay.gunMiktari);
        System.out.println("ay.ayAd = " + ay.ayAd);

        Aylar ilkAy = Aylar.OCAK;
        System.out.println("ilkAy = " + ilkAy + " - " +
                "ilkAy.ayNo = " + ilkAy.ayNo + " - " +
                "ilkAy.gunMiktari = " + ilkAy.gunMiktari +
                " - " + "ilkAy.ayAd = " + ilkAy.ayAd);
//        Month.DECEMBER -> Java'nin kendi fonksiyonu
    }
}
