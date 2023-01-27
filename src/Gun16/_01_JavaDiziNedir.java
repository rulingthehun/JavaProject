package Gun16;

import java.util.Scanner;

public class _01_JavaDiziNedir {
    public static void main(String[] args) {
        int ogrNot; //1 tane sayi saklar

        int ogrNot1;
        int ogrNot2;
        int ogrNot3;
        int ogrNot4;
        //...
        int ogrNot100;
        //Bir tanimlamada birden fazla deger tutabilcek bir degiskene ihtiyacim var.
        //Cozum
        int not = 0;
        int[] notlar = new int[250]; //250 tane not tutabilen INT tipinde degisken

        notlar[0] = 60; //0. kutudaki deger 60 -> ogrNot1
        notlar[1] = 70; //1. kutudaki deger 70
        //...
        //...
        notlar[249] = 80; //249. kutudaki deger 80
        System.out.println("notlar = " + notlar[0]);
        Scanner oku = new Scanner(System.in);
        for (int i = 0; i < 250; i++) {
            System.out.print("Not girin = ");
            notlar[i] = oku.nextInt();
        }
        for (int i = 0; i < 250; i++) {
            System.out.println(notlar[i]);
        }
    }
}