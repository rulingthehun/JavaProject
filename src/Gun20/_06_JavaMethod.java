package Gun20;

import java.util.Arrays;
import java.util.Scanner;

public class _06_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcıdan sayi alarak 5 elemanlı bir diziyi doldurduktan sonra,
        // dizinin en küçük, en büyük elemanını ve
        // ortalamasını ayrı fonksiyonlarda bulup yazdırınız
        int[] dizi = new int[5];
        Scanner oku = new Scanner(System.in);
        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i + 1) + ". sayiyi girin = ");
            dizi[i] = oku.nextInt();
        }
        diziENB(dizi);
        diziENK(dizi);
        diziORT(dizi);
    }

    public static void diziENB(int[] sayilar) {
        int enb = sayilar[0];
        for (int i = 0; i < sayilar.length; i++)
            if (sayilar[i] > enb)
                enb = sayilar[i];
        System.out.println("En buyuk sayi = " + enb);
        //2. yol
        Arrays.sort(sayilar);
        System.out.println("En buyuk sayi = " + sayilar[sayilar.length - 1]);
    }

    public static void diziENK(int[] enKucuk) {
        int enk = enKucuk[0];
        for (int i = 0; i < enKucuk.length; i++)
            if (enKucuk[i] < enk)
                enk = enKucuk[i];
        System.out.println("En kucuk sayi = " + enk);
        //2. yol
        Arrays.sort(enKucuk);
        System.out.println("En kucuk sayi = " + enKucuk[0]);
    }

    public static void diziORT(int[] ortalama) {
        int ort = 0;
        for (int i = 0; i < ortalama.length; i++)
            ort += ortalama[i];
        ort = ort / ortalama.length;
        System.out.println("Dizinin ortalamasi = " + ort);
    }
}