package Gun06;

import java.util.Scanner;

public class _01_Ornek {
    // Kullanıcıdan Cadde, Sokak , Posta Kodu(int) ve ülke şeklinde
    // adres bilgisi alarak yazdırınız.
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Cadde= ");
        String cadde = oku.nextLine();
        System.out.print("Sokak= ");
        String sokak = oku.nextLine();
        Scanner okuInt=new Scanner(System.in);
        System.out.print("Posta Kodu= ");
        int pk = okuInt.nextInt();
        System.out.print("Ulke= ");
        String ulke = oku.nextLine();
        System.out.print("Adres= "+cadde+" "+sokak+" "+pk+" "+ulke);
    }
}
