package Gun19;

import java.util.Scanner;

public class _04_Java2DArrays {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        int[][] tablo = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((i + 1) + ", " + (j + 1) + " sayiyi girin = ");
                tablo[i][j] = oku.nextInt();
            }
        }
        int enb = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablo[i][j] > enb)
                    enb = tablo[i][j];
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("tablonun " + (i + 1) + ". satiri " + (j + 1) + ". sutunu = " + tablo[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("En buyuk sayi = " + enb);
    }
}
