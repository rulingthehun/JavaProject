package Gun07;

import java.util.Scanner;

public class _02_Soru {
    //Girilen bir ad soyadin adini ve soyadini ayirip ayri ayri yazdiriniz.
    public static void main(String[] args) {
        System.out.print("Adinizi ve soyadinizi girin= ");
        Scanner oku=new Scanner(System.in);
        String tamAd= oku.nextLine();
        int boslukIndex=tamAd.indexOf(" ");
        String ad=tamAd.substring(0,boslukIndex);
        String soyad=tamAd.substring(boslukIndex);
        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
    }
}