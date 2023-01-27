package Gun11;

import java.util.Scanner;

public class _09_JavaRandom {
    // Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışnız
    // kullanıcı bilirse tebrikler yazdırınız.
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Kaca kadar sayi uretilsin? ");
        int sinir = oku.nextInt();
        int intRandomSayi = (int) (Math.random() * sinir);
        System.out.print("Sayiyi tahmin edin = ");
        int tahmin = oku.nextInt();
        if (intRandomSayi == tahmin) {
            System.out.println("Dogru tahmin");
        } else {
            System.out.println("Yanlis tahmin sayi " + intRandomSayi);
        }
    }
}