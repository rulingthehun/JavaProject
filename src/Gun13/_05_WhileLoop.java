package Gun13;

import java.util.Scanner;

public class _05_WhileLoop {
    // Girilen bir sayıya kadar(girilen sayı dahil) olan sayıların
    // toplamını bularak yazdırınız.
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Kaca kadar sayilar toplansin? ");
        int sinir = oku.nextInt();
        int sayac = 0;
        int toplam = 0;
        while (sayac <= sinir) {
            toplam = toplam + sayac;
            sayac++;
        }
        System.out.println("toplam = " + toplam);
        //2. yontem
        toplam = 0;
        while (sinir > 0) {
            toplam = toplam + sinir;
            sinir--;
        }
        System.out.println("toplam2 = " + toplam);
    }
}
