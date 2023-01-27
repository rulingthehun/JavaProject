package Gun13;

import java.util.Scanner;

public class _06_WhileLoop {
    // Girilen bir sayıya kadar olan sayılardan sadece tek olanlarının
    // toplamını bulunuz.
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Kaca kadar sayilar toplansin? ");
        int sinir = oku.nextInt();
        int sayac = 0;
        int toplam = 0;
        while (sayac <= sinir) {
            if (sayac%2==1){
                toplam = toplam + sayac;
            }
            sayac++;
        }
        System.out.println("toplam = " + toplam);
    }
}