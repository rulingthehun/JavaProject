package Gun16;

import java.util.Scanner;

public class _05_JavaArray {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 7 sayıyı aldıktan sonra
        // kaç tanesinin ortalamadan büyük ve tek sayı olduğunu bulunuz.
        Scanner oku = new Scanner(System.in);
        int[] sayi = new int[7];
        int toplam = 0;
        int sayac = 0;
        for (int i = 0; i < sayi.length; i++) {
            System.out.print((i + 1) + ". sayiyi girin = ");
            sayi[i] = oku.nextInt();
            toplam = toplam + sayi[i];
        }
        double ortalama = toplam / sayi.length;

        for (int j = 0; j < sayi.length; j++) {
            if (sayi[j] > ortalama && (sayi[j] % 2 == 1)) {
                sayac++;
            }
        }
        System.out.println("ortalama = " + ortalama);
        System.out.println(sayac + " tane sayi ortalamadan buyuk ve tek sayi");
    }
}
