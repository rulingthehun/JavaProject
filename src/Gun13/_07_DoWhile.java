package Gun13;

import java.util.Scanner;

public class _07_DoWhile {
    public static void main(String[] args) {
        //kullanici 0 degeri girene kadar girdigi sayilarin toplamini bul.
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi girin = ");
        int sayi = oku.nextInt();
        int toplam = 0;
        while (sayi != 0) {
            toplam = toplam + sayi;
            System.out.print("Sayi girin = ");
            sayi = oku.nextInt();
        }
        System.out.println("toplam = " + toplam);
        //Do-While dongusu
        toplam = 0;
        do { //bu dongude donguye mutlaka girer kontrol sonda olur
            System.out.print("Sayi girin = ");
            sayi = oku.nextInt();
            toplam = toplam + sayi;
        } while (sayi != 0);
        System.out.println("toplam 2 = " + toplam);
    }
}