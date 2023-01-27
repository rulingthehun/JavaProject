package Gun33._03_Ornek;

import java.util.Scanner;

//6- bir okul nesnesi oluşturup, bu okula max öğrenci miktarına ulaşana kadar kullanıcıdan alarak
//     öğrenci ekleyiniz. Fakat oluşturacağınız öğrencilerin yaşı 15 i geçmemeli.
//     bu yaşı geçen bir öğrenci eklenmek istenir ise yerine başka öğrenci isteyiniz.
public class OkulMain {
    public static void main(String[] args) {
//        Bir okul olmali (Max kontenjan ve adi olan)
        Scanner okuInt = new Scanner(System.in);
        Scanner okuStr = new Scanner(System.in);
        Okul yeniOkul = new Okul("Ataturk Okulu", 3);

        do {
//            Scanner islemleri, kullanicidan veri alma, ogrenci bilgi alma kismi
            System.out.print("Ogrenci Adi = "); String ad = okuStr.nextLine();
            System.out.print("Ogrenci Soyadi = "); String soyad = okuStr.nextLine();
            System.out.print("Ogrenci Yasi = "); int yas = okuInt.nextInt();
//            yas kontrol
            if (yas < 15){
//                ise ekle
                Ogrenci ogr = new Ogrenci(ad, soyad, yas);
                yeniOkul.ogrenciler.add(ogr);
            }
            else {
                System.out.println("Ogrenci yasi okul icin uygun degil");
            }

        }while (yeniOkul.ogrenciler.size() < yeniOkul.getKontenjan());
        System.out.println("yeniOkul = " + yeniOkul);
        System.out.println("yeniOkul.ogrenciler = " + yeniOkul.ogrenciler);
    }
}
