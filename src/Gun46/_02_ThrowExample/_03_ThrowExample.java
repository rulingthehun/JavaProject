package Gun46._02_ThrowExample;

import java.util.Scanner;

public class _03_ThrowExample {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.println("Yeni sifre olusturma");
        System.out.print("Yeni sifrenizi olusturunuz = ");
        String password = oku.nextLine();

        try {
            if (password.length() < 8)
                throw new Exception("Sifre 8 karakterden kucuk olamaz");
//            Bu mesaj ile hata olustur

            if (password.length() > 15)
                throw new Exception("Sifre 15 karakterden buyuk olamaz");

        } catch (Exception ex) {
//            Hatalar bir yere toplanip hepsi icin yapilmasi gereken islemler
//            bir arada burada yapilabilir, log tutma gibi
            System.out.println("Lutfen dikkat!");
            System.out.println("Uyari = " + ex.getMessage());
//            log tutma islemi
        }
    }
}
