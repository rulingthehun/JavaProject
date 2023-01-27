package Gun16;

import java.util.Scanner;

public class _04_JavaArray {
    // 100 kişilik bir sınıfın notlarını giriniz ve ortalamadan büyük
    // kaç not olduğunu bulunuz ve bunları yazdırnız.
    public static void main(String[] args) {
        int[] ogrNot = new int[3];
        int notToplam = 0;
        Scanner oku = new Scanner(System.in);
        for (int i = 0; i < ogrNot.length; i++) {
            System.out.print("Ogrenci notunu girin = ");
            ogrNot[i] = oku.nextInt();
            notToplam = notToplam + ogrNot[i];
        }
        double ortalama = notToplam / ogrNot.length;
        int sayac = 0;
        for (int j = 0; j < ogrNot.length; j++) {
            if (ogrNot[j] >= ortalama) {
                System.out.println("Ortalamanin ustunde not = " + ogrNot[j]);
                sayac++;
            }
        }
        System.out.println("ortalama = " + ortalama);
        System.out.println(sayac + " kisi ortalamanin ustunde not aldi.");
    }
}
//Cikti:
//        Ogrenci notunu girin = 55
//        Ogrenci notunu girin = 55
//        Ogrenci notunu girin = 55
//        Ogrenci notunu girin = 66
//        Ogrenci notunu girin = 66
//        Ortalamanin ustunde not = 66
//        Ortalamanin ustunde not = 66
//        2 kisi ortalamanin ustunde not aldi.