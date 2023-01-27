package Gun08;

import java.util.Scanner;

public class _08_Soru {
    // girilen bir sayının tek sayı olup olmadığını yazdırınız.
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Bir sayi girin = ");
        int sayi = oku.nextInt();
        System.out.println("Tek mi? " + (sayi % 2 == 1));
    }
}
