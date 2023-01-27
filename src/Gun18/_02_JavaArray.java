package Gun18;

import java.util.Arrays;

public class _02_JavaArray {
    public static void main(String[] args) {
        // 100 elemanlı bir diziyi random (0-100 arası) doldurduktan sonra,
        // sadece tek elemanlarını bir başka diziye atayınız.
        // yeni dizide 0'lar olmasin.
        int[] dizi = new int[100]; //100 elemanlı bir dizi
        int tekMiktar = 0;
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 100); //random (0-100 arası) doldur

            if (dizi[i] % 2 == 1)
                tekMiktar++;
        }
        System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi));
        int[] tekElemanlar = new int[tekMiktar]; //bir başka dizi
        int j = 0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] % 2 == 1) { // sadece tek elemanlarını bir başka diziye atayınız.
                tekElemanlar[j] = dizi[i];
                j++;
            }
        }
        System.out.println("tekElemanlar = " + Arrays.toString(tekElemanlar));
    }
}
