package Gun11;

import java.util.Scanner;

public class _05_JavaTernary {
    // Soru : Girilen bir sayının sıfır mı, negatif mi, pozitif mi
    //        olduğunu Ternary operatör ile yazdırınız.
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi girin = ");
        int sayi = oku.nextInt();
        System.out.println((sayi == 0) ? "Sifir" : (sayi < 0) ? "Negatif" : "Pozitif");
    }
}
