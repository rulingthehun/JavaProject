package Gun09;

import java.util.Scanner;

public class _09_JavaIfOrnek {
    // Girilen 3 sayıdan en büyük olanını bulunuz.
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("3 sayi girin = ");
        int s1 = oku.nextInt();
        int s2 = oku.nextInt();
        int s3 = oku.nextInt();
        int enb = s1;
        if (s2 > enb) {
            enb = s2;
        }
        if (s3 > enb) {
            enb = s3;
        }
        System.out.println("en buyuk sayi = " + enb);
    }
}