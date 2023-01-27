package Gun09;

import java.util.Scanner;

public class _08_JavaIf {
    // Girilen 3 sayıdan en büyük olanını bulunuz.
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.println("3 sayi girin = ");
        int sayi1 = oku.nextInt();
        int sayi2 = oku.nextInt();
        int sayi3 = oku.nextInt();
        if (sayi1 > sayi2) {
            if (sayi1 > sayi3) {
                System.out.print(sayi1 + " en buyuk sayi");
            }
            if (sayi3 > sayi1) {
                System.out.print(sayi3 + " en buyuk sayi");
            }
        }
        if (sayi2 > sayi1) {
            if (sayi2 > sayi3) {
                System.out.print(sayi2 + " en buyuk sayi");
            }
            if (sayi3 > sayi2) {
                System.out.print(sayi3 + " en buyuk sayi");
            }
        }
    }
}
