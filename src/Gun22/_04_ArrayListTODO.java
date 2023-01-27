package Gun22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _04_ArrayListTODO {
    // Tek elemanlarini ayri diziye bir metodda atayarak main de yazdiriniz.
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        int[] dizi = new int[6];
        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i + 1) + ". sayiyi girin = ");
            dizi[i] = oku.nextInt();
        }
        System.out.println("dizi = " + Arrays.toString(dizi));
        ArrayList<Integer> tekSayilar = new ArrayList<>();
        tekSayilar = tekEleman(dizi);

        System.out.println("tekSayilar = " + tekSayilar);
    }

    public static ArrayList<Integer> tekEleman(int[] dizi) {
        ArrayList<Integer> tekSayilar = new ArrayList<>();
        for (int i = 0; i < dizi.length; i++)
            if (dizi[i] % 2 == 1)
                tekSayilar.add(dizi[i]);
        return tekSayilar;
    }
}