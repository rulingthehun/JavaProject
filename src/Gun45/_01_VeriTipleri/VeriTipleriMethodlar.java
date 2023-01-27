package Gun45._01_VeriTipleri;

import java.util.Arrays;

public class VeriTipleriMethodlar {
    public static void main(String[] args) {
//        Ilkel tip - Primitive tip
        int sayi = 5;
        sayiArtir(sayi);
        System.out.println("sayi = " + sayi); //Sayi = 5

        sayi = sayiArtir2(sayi);
        System.out.println("sayi = " + sayi); //Sayi = 6

//        Referans tip - Referance tip
        int[] dizi = {1, 2, 3};
        diziSifirla(dizi);
        System.out.println("dizi = " + Arrays.toString(dizi));

//        Nesne tip: Null alabilen ilkel tip - Object tip
        String isim = "Burak";
        kelimeSifirla(isim);
        System.out.println("isim = " + isim);

//        Ozet: Temel fark
//        1 - Ilkel tipler sadece 1 deger saklar, methodlara sadece degeri gider. Esitlemede sadece degeri aktarilir
//        2 - Nesne tiplerin ilkel tiplerden tek farki NULL degeri alabilmeleri, ilkel tip gibi davranir
//        3 - Referans tipler methoda gonderildiklerinde tipin kendisi gider. Esitlemede referanslar esitlenir

//        Esit mi
//        Ilkel tiplerde == vr equals farketmez degerler karsilastirilir
//        Referance ve Nesne tipler icin esitlik kontrolunde == in manasi refernslari ayni mi demek
//                                                             equals'in manasi ise degerleri ayni mi demek

    }
    public static void sayiArtir (int sayi){
        sayi += 1;
    }

    public static int sayiArtir2 (int sayi){ //Ilkel tiplerde aktarilan degerdir
        sayi += 1;
        return sayi;
    }
    
    public static void diziSifirla (int[] dizi) { //Referans tiplerin methodlara adresi gider -> Kendisi - Bu yuzden return e ihtiyaci yok
        dizi[0] = 0;
        dizi[1] = 0;
        dizi[2] = 0;
    }

    public static void kelimeSifirla(String kelime) { //Ilkel tip gibi davranir
        kelime = "";
    }
}
