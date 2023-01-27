package Gun21;

import java.util.Scanner;

public class _05_JavaMethod {
    //Kullanıcının gireceği 2 sayının toplamını
    //bir fonksiyonda buldurup, bunun sonucunu main de yazdırınız.
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("1. sayiyi girin = ");
        int sayi1 = oku.nextInt();
        System.out.print("2. sayiyi girin = ");
        int sayi2 = oku.nextInt();
        int toplam = toplamBul(sayi1, sayi2);
        System.out.println("toplam = " + toplam);
    }

    public static int toplamBul(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }
}
