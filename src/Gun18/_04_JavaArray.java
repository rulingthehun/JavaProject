package Gun18;

import java.util.Arrays;
import java.util.Scanner;

public class _04_JavaArray {
    public static void main(String[] args) {
        // 10 elemanlı bir diziyi, 10 a kadar olan sayılarla random duldurunuz,
        // sonrasında kullancıdan alacağınız bir sayının dizide olup olmadığını
        // var veya yok diyerek yazdırınız.
        Scanner oku = new Scanner(System.in);
        int[] dizi = new int[10];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 10);
        }
        Arrays.sort(dizi);
        System.out.print("10'a kadar bir sayi girin = ");
        int sayi = oku.nextInt();
        int index = Arrays.binarySearch(dizi,sayi);
        if (index>=0)
            System.out.println("Sayi dizide var.");
        else
            System.out.println("Sayi dizide yok.");
        System.out.println("dizi = " + Arrays.toString(dizi));
        // TODO : hem negatif hemde pozitif 10 sayi uretebilen bir algoritma yaz
    }
}