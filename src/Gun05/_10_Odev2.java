package Gun05;

import java.util.Scanner;

public class _10_Odev2 {
    public static void main(String[] args) {
        //Bir int oluşturun. Konsol'a herhangi bir sayı giriniz.Bu sayıyı yazdırın.
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi giriniz=");
        int sayi = oku.nextInt();
        System.out.println("Girdiginiz sayi = " + sayi);
    }
}
/*
Cikti=
Sayi giriniz=8
Girdiginiz sayi = 8
 */