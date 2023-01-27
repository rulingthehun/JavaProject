package Gun17;

import java.util.Arrays;

public class _07_JavaArray {
    public static void main(String[] args) {
        // 100 elemanlı bir diziyi random (0-100 arası) doldurduktan sonra,
        // sadece tek elemanlarını bir başka diziye atayınız.
        int[] dizi = new int[100]; //100 elemanlı bir dizi
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 100); //random (0-100 arası) doldur
        }
        System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi));
        int[] tekElemanlar = new int[100]; //bir başka dizi
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] % 2 == 1) { // sadece tek elemanlarını bir başka diziye atayınız.
                tekElemanlar[i] = dizi[i];
            }
        }
        System.out.println("tekElemanlar = " + Arrays.toString(tekElemanlar));
    }
}
