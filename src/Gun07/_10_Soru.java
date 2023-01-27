package Gun07;

import java.util.Scanner;

public class _10_Soru {
    public static void main(String[] args) {
        // Girilen bir stringdeki nokta sayısını bulunuz
        // orneğin 01.02.20   bu strinde kaç tane nokta vardır
        Scanner oku=new Scanner(System.in);
        System.out.print("Bilgi giriniz= ");
        String noktaliString= oku.nextLine();
        int ilkUzunluk=noktaliString.length();
        noktaliString=noktaliString.replace(".","");
        int sonUzunluk=noktaliString.length();
        int noktaSayisi=ilkUzunluk-sonUzunluk;
        System.out.println("nokta sayisi= "+noktaSayisi);
    }
}