package Gun11;

import java.util.Scanner;

public class _04_JavaTernary {
    //Soru: Girilen sayı 50 den büyük ise 1 , değilse 0 değerini ekrana yazdırınız.
    // Ternary operatör ile yapınız.
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi girin = ");
        int sayi = oku.nextInt();
        if (sayi > 50) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        System.out.print((sayi > 50) ? "1" : "0");
    }
}
