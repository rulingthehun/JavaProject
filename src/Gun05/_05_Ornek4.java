package Gun05;

import java.util.Scanner;

public class _05_Ornek4 {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 2 tam sayının toplamını ekrana yazdırınız.
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi giriniz= ");
        int sayi1 = oku.nextInt();
        System.out.print("Sayi giriniz= ");
        int sayi2 = oku.nextInt();
        int toplam = sayi1 + sayi2;
        System.out.println("toplam = " + toplam);
        System.out.println("sayilar toplami = " + (sayi1 + sayi2)); //sayi toplami parantez icinde yazilmazsa sayilari
        //yan yana yazar, toplama yapmaz.
    }
}
//CTRL+ALT+L satirlari duzenleme