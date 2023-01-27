package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _07_Java2DArrays {
    //Gunun sorusu: 3x2 lik bir diziyi kullanicidan sayi alarak doldurduktan sonra sadece tek elemanlarini
    //tek boyutlu bir diziye atayınız.
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        int[][] tablo = new int[3][2];
        int tekSayilar = 0;
        for (int i = 0; i < tablo.length; i++)
            for (int j = 0; j < 2; j++) {
                System.out.print("Tablonun " + (i + 1) + ". satiri " + (j + 1) + ". sutununu girin = ");
                tablo[i][j] = oku.nextInt();

            }
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                System.out.println("Tablonun " + (i + 1) + ". satiri " + (j + 1) + ". sutunu = " + tablo[i][j] + "\t");
                if (tablo[i][j] % 2 == 1)
                    tekSayilar++;
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(tablo));
        System.out.println("Tek sayi miktari = " + tekSayilar);
    }
}