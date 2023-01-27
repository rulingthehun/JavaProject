package Gun13;

import java.util.Scanner;

public class _03_WhileLoop {
    public static void main(String[] args) {
        //Girilen 20 sayinin toplaminin sonucunu yazdirin
        Scanner oku = new Scanner(System.in);
        int sayac = 0;
        int toplam = 0;
        while (sayac < 20) {
            System.out.print((sayac + 1) + ". Sayi girin = ");
            int sayi = oku.nextInt();
            toplam = toplam + sayi;
            sayac++;
        }
        System.out.println("toplam = " + toplam);
    }
}
