package Gun09;

import java.util.Scanner;

public class _05_JavaIf {
    public static void main(String[] args) {
        // Girilen bir sayının sadece, birler basamağını yazı ile yazdırınız
        // 1 -> bir    2-> iki
        //TODO negatif sayi nasil yazilir?
        Scanner oku = new Scanner(System.in);
        System.out.print("Bir sayi girin = ");
        int sayi = oku.nextInt();
        int birler = sayi % 10;
        if (birler==0) {System.out.println("Sifir");}
        if (birler==1) {System.out.println("Bir");}
        if (birler==2) {System.out.println("Iki");}
        if (birler==3) {System.out.println("Uc");}
        if (birler==4) {System.out.println("Dort");}
        if (birler==5) {System.out.println("Bes");}
        if (birler==6) {System.out.println("Alti");}
        if (birler==7) {System.out.println("Yedi");}
        if (birler==8) {System.out.println("Sekiz");}
        if (birler==9) {System.out.println("Dokuz");}
    }
}