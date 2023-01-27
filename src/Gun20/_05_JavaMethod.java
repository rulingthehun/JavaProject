package Gun20;

import java.util.Arrays;

public class _05_JavaMethod {
    public static void main(String[] args) {
        // 20 elemanlı bir dizinin elemanlarını 100 kadar random sayılarla
        // bir fonksiyonda doldurunuz ve aynı fonksiyonda yazdırınız.
        int[] dizi = new int[20];
        diziDoldurYaz(dizi);
    }

    public static void diziDoldurYaz(int[] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < dizi.length; i++) {
            System.out.println((i + 1) + ". sayi = " + dizi[i]);
        }
        System.out.println("Dizi = " + Arrays.toString(dizi));
    }
}

