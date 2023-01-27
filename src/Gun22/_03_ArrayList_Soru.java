package Gun22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _03_ArrayList_Soru {
    // Kullanıcıdan alacağınız 6 elemanlı bir dizinin
    // sadece tek sayı olan elemanlarını ayrı diziye atayarak
    // yazdırınız.
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        int[] dizi = new int[6];
        ArrayList<Integer> tekSayilar = new ArrayList<>();
        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Sayi girin = ");
            dizi[i] = oku.nextInt();
            if (dizi[i] % 2 == 1)
                tekSayilar.add(dizi[i]);
        }
        System.out.println("dizi = " + Arrays.toString(dizi));
        System.out.println("tekSayilar = " + tekSayilar);
    }
}