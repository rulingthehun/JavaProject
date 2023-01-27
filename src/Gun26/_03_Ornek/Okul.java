package Gun26._03_Ornek;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    // Ogretmen için not defteri programı yapılmak isteniyor.
    // Her ogrencının okulNo(int), tamAdi(String) ve notu(int) vardır.
    // Öğretmenden 20 öğrenci için bu bilgileri alınız.
    // bütün öğrencileri yazdırınız.
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        Scanner okuStr = new Scanner(System.in);
        ArrayList<ogrNot> liste = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            ogrNot ogr = new ogrNot();

            System.out.print("Ogrencinin adi, soyadi = ");
            ogr.adSoyad = okuStr.nextLine();
            System.out.print("Ogrencinin okul no = ");
            ogr.okulNo = oku.nextInt();
            System.out.print("Ogrencinin notu = ");
            ogr.not = oku.nextInt();
            liste.add(ogr);
        }
        bilgiYazdir(liste);
        //TODO : sınıf ortalamasını bir metodda bulduktan sonra geçen öğrencilerin
        //TODO : aynı metodda isimlerini yazdırınız.
        ortYazdir(liste);
//        1. yontem
//        for (ogrNot ogr:
//             liste) {
//            System.out.println("ogr.adSoyad = " + ogr.adSoyad);
//            System.out.println("ogr.okulNo = " + ogr.okulNo);
//            System.out.println("ogr.not = " + ogr.not);
    }

    public static void bilgiYazdir(ArrayList<ogrNot> liste) {
        for (ogrNot ogr :
                liste) {
            System.out.println(ogr.okulNo + " " + ogr.adSoyad + " " + ogr.not);
        }
    }

    public static void ortYazdir(ArrayList<ogrNot> liste) {
        int notToplam = 0;
        for (ogrNot ogr :
                liste) {
            notToplam += ogr.not;
        }
        int ort = notToplam/ liste.size();

        for (ogrNot ogr:
             liste) {
            if (ogr.not >= ort)
                System.out.println(ogr.okulNo + " " + ogr.adSoyad + " " + ogr.not + " Gecti");
            else
                System.out.println(ogr.okulNo + " " + ogr.adSoyad + " " + ogr.not + " Kaldi");
        }
    }
}
