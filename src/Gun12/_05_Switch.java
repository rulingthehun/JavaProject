package Gun12;

import java.util.Scanner;

public class _05_Switch {
    // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
    // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
    // harflerini alarak isteğe uygun olan işlemi yaptırıp
    // sonucu yazdırınız.(switch kullanınız)
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi1 girin = ");
        int sayi1 = oku.nextInt();
        System.out.print("Sayi2 girin = ");
        int sayi2 = oku.nextInt();
        Scanner oku2 = new Scanner(System.in);
        System.out.print("Toplama icin T\nCikarma icin C\nCarpma icin P\nBolme icin B\ngirin = ");
        String islem = oku2.next();
        switch (islem.toUpperCase()){
            case "T": System.out.println("Toplam = "+(sayi1+sayi2));break;
            case "C": System.out.println("Cikarma = "+(sayi1-sayi2));break;
            case "P": System.out.println("Carpma = "+(sayi1*sayi2));break;
            case "B": System.out.println("Bolme = "+(sayi1/sayi2));break;
            default: System.out.println("Hatali secim");break;
        }
    }
}
