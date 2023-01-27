package Gun21;

import java.util.Scanner;

public class _02_JavaMethod {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("1. sayiyi girin = ");
        int sayi1 = oku.nextInt();
        System.out.print("2. sayiyi girin = ");
        int sayi2 = oku.nextInt();
        System.out.println("enbBul = " + enbBul(sayi1,sayi2));
        if (enbBul(sayi1,sayi2)>0)
            System.out.println("merhaba");
        merhabaYaz();
    }

    public static void merhabaYaz() {
        System.out.println("Merhaba");
    }

    public static int enbBul(int sayi1, int sayi2) {
        int enb = 0;
        if (sayi1 > sayi2)
            enb = sayi1;
        else
            enb = sayi2;
        return enb; //Fonksiyon isminden onceye degiskenin tipi yazilir.
    }
}