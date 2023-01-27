package Gun06;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {
        //Girilen bir ad soyadi "Ismet Temur" I.T. seklinde yazdiriniz.
        System.out.print("Adinizi ve soyadinizi girin= ");
        Scanner oku = new Scanner(System.in);
        String tamAd= oku.nextLine();
        char ilkHarf=tamAd.charAt(0);
        int boslukIndex=tamAd.indexOf(" ");
        char soyadIlkHarf= tamAd.charAt(boslukIndex+1);
        System.out.println(ilkHarf+"."+soyadIlkHarf+".");
    }
}
