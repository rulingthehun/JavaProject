package Gun11;

import java.util.Scanner;

public class _07_JavaMath {
    //  Math.max yöntemi ile girilen 3 sayıdan büyük olanını bulunuz
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi girin = ");
        int sayi1 = oku.nextInt();
        System.out.print("Sayi girin = ");
        int sayi2 = oku.nextInt();
        System.out.print("Sayi girin = ");
        int sayi3 = oku.nextInt();
        System.out.println("En buyuk sayi = " + Math.max(sayi1, Math.max(sayi2, sayi3)));
    }
}