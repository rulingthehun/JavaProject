package Gun31._02_FinalModifier.Ornek3;

import java.util.Scanner;

public class gunSaat {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Gun sayisi = ");
        int gun = oku.nextInt();
        System.out.print("Saat sayisi = ");
        int saat = oku.nextInt();
        System.out.print("Dakika sayisi = ");
        int dakika = oku.nextInt();
        //1. yontem
        int toplamSaniye= gun * Sabitler.gundeSaat *
                Sabitler.saatteDakika * Sabitler.dakikadaSaniye +
                saat * Sabitler.saatteDakika *
                        Sabitler.dakikadaSaniye +
                dakika * Sabitler.dakikadaSaniye;
        System.out.println("Toplam Saniye = " + toplamSaniye);
        //2. yontem
        System.out.println("Sabitler.toSecond() = " +
                Sabitler.toSecond(gun, saat, dakika));
    }

}
