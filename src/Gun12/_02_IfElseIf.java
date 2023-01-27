package Gun12;

import java.util.Scanner;

public class _02_IfElseIf {
    // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
    // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
    // harflerini alarak isteğe uygun olan işlemi yaptırıp
    // sonucu yazdırınız.
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("1. sayiyi girin = ");
        int sayi1 = oku.nextInt();
        System.out.print("2. sayiyi girin = ");
        int sayi2 = oku.nextInt();
        Scanner oku2 = new Scanner(System.in);
        System.out.println("Hangi islemi yapmak istiyorsunuz? ");
        System.out.print("Toplama icin= T\nCikarma icin= C\nCarpma icin= P\nBolme icin= B girin = ");
        String islem = oku2.next();
        //ladder if, merdiven tipi if kullanimi
        if (islem.equalsIgnoreCase("t")) {
            int toplam = sayi1 + sayi2;
            System.out.println("toplam = " + toplam);
        } else if (islem.equalsIgnoreCase("c")) {
            int cikarma = sayi1 - sayi2;
            System.out.println("cikarma = " + cikarma);
        } else if (islem.equalsIgnoreCase("p")) {
            int carpma = sayi1 * sayi2;
            System.out.println("carpma = " + carpma);
        } else if (islem.equalsIgnoreCase("b")) {
            double bolme = sayi1 / sayi2;
            System.out.println("bolme = " + bolme);
        }
        else {
            System.out.println("Hatali secim");
        }
    }
}