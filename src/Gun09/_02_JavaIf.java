package Gun09;

import java.util.Scanner;

public class _02_JavaIf {
    // Girilen bir sayının negatif mi , pozitif mi olduğunu yazdırınız.
    // Sıfır ise sıfır yazdırınız.
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Bir sayi girin = ");
        int sayi = oku.nextInt();
        if (sayi==0)
        {
            System.out.print("Sifir");
        }
        if (sayi>0)
        {
            System.out.print("Pozitif");
        }
        if (sayi<0)
        {
            System.out.print("Negatif");
        }
    }
}