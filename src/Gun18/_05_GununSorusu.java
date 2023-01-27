package Gun18;

import java.util.Arrays;

public class _05_GununSorusu {
    // Hem negatif hemde pozitif 10 sayi uretebilen bir algoritma yaz
    public static void main(String[] args) {
        int[] dizi = new int[10];
        for (int i = 0; i < dizi.length; i++)
            dizi[i] = (int) (Math.random() * 10) - 5;
        System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi));
    }
}