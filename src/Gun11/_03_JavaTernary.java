package Gun11;

import java.util.Scanner;

public class _03_JavaTernary {
    // Kullanıcının gireceği sayının tek mi çift mi olduğunu yazdırınız.
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi girin = ");
        int sayi = oku.nextInt();
        //1. yontem
        if (sayi % 2 == 0) {
            System.out.println("Sayi cift");
        } else {
            System.out.println("Sayi tek");
        }
        //Tek satirda yazma yontemi ***ternary yontemi***
        String sonuc = (sayi % 2 == 0) ? "Cift" : "Tek"; //Sart dogruysa 1. degilse 2.
        System.out.println("sonuc = " + sonuc);

        //Direkt ciktida yazma
        System.out.println((sayi % 2 == 0) ? "Cift" : "Tek");
    }
}
