package Gun26._02_Ornek;

import java.util.ArrayList;
import java.util.Scanner;

public class ogrenci {
    // Bir okulda kayıt programı için Ogrenci bilgilerini alan modül
    // yazılacaktır. Ogrenci ye ait bilgiler (adi, soyadi, sinifi ve adres) vardır.
    // bu yapıyı oluşturunuz.
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        Scanner okuLine = new Scanner(System.in);
        ArrayList<ogrKayit> liste = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            ogrKayit ogr = new ogrKayit();
            System.out.print("Ogrencinin adi = ");
            ogr.adi = oku.next();
            System.out.print("Ogrencinin soyadi = ");
            ogr.soyadi = oku.next();
            System.out.print("Ogrencinin sinifi = ");
            ogr.sinifi = oku.next();
            System.out.print("Ogrencinin adresi = ");
            ogr.adresi = okuLine.nextLine();
            liste.add(ogr);
        }

        for (ogrKayit ogr:
                liste) {
            System.out.println("ogr.adi = " + ogr.adi);
            System.out.println("ogr.soyadi = " + ogr.soyadi);
            System.out.println("ogr.sinifi = " + ogr.sinifi);
            System.out.println("ogr.adresi = " + ogr.adresi);
        }

    }
}
