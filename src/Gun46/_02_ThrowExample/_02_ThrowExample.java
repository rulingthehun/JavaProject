package Gun46._02_ThrowExample;

import java.util.Scanner;

public class _02_ThrowExample {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.println("Yeni sifre olusturma");

        System.out.print("Yeni sifrenizi olusturunuz = ");
        String password = oku.nextLine();

        if (password.length() < 8) {
            System.out.println("Lutfen dikkat!");
            System.out.println("Sifre 8 karakterden kucuk olamaz");
//            log tutma islemi
        }

        if (password.length() > 15) {
            System.out.println("Lutfen dikkat!");
            System.out.println("Sifre 15 karakterden buyuk olamaz");
//            log tutma islemi
        }
    }
}
