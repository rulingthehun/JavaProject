package Gun09;

import java.util.Scanner;

public class _03_JavaIf {
    public static void main(String[] args) {
        // Girilen iki sayıdan büyük olanını değerini ekrana yazdırınız,
        // eşit ise eşit yazdırınız.
        Scanner oku = new Scanner(System.in);
        System.out.print("2 sayi girin = ");
        int sayi1 = oku.nextInt();
        int sayi2 = oku.nextInt();
        if (sayi1 > sayi2) {
            System.out.print(sayi1 + " buyuk");
        }
        if (sayi2 > sayi1) {
            System.out.print(sayi2 + " buyuk");
        }
        if (sayi1 == sayi2) {
            System.out.print("Sayilar esit");
        }
    }
}
