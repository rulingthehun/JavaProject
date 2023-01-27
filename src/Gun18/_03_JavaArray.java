package Gun18;

import java.util.Arrays;

public class _03_JavaArray {
    // 10 elemanlı bir diziyi random (0-100 arası) doldurduktan sonra,
    // tek elemanlarını ayrı bir diziye, çift elemanlarını ayrı bir başka
    // diziye, sadece atanana elemanların sayısı kadar olacak şekilde atayınız.
    public static void main(String[] args) {
        int[] dizi = new int[10];
        int tekMiktar = 0;
        int ciftMiktar = 0;
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 100);
            if (dizi[i] % 2 == 1)
                tekMiktar++;
            else
                ciftMiktar++;
        }
        int[] tekDizi = new int[tekMiktar];
        int[] ciftDizi = new int[ciftMiktar];
        int j = 0;
        int f = 0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] % 2 == 1) {
                tekDizi[j] = dizi[i];
                j++;
            } else {
                ciftDizi[f] = dizi[i];
                f++;
            }
        }
        System.out.println("dizi = " + Arrays.toString(dizi));
        System.out.println("tek elemanlar = " + Arrays.toString(tekDizi));
        System.out.println("cift elemanlar = " + Arrays.toString(ciftDizi));
    }
}