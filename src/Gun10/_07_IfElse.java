package Gun10;

import java.util.Scanner;

public class _07_IfElse {
    public static void main(String[] args) {
        // yan yana aralarında bir boslukla girilen 2 int sayının
        // birbirine eşit olup olmadığını bulunuz
        // 45 67
        Scanner oku = new Scanner(System.in);
        System.out.print("Arasinda bir boslukla 2 sayi girin = ");
        String girdi = oku.nextLine();
        int boslukIndex = girdi.indexOf(" ");
        String sayi1 = girdi.substring(0, boslukIndex);
        sayi1 = sayi1.replace(" ", "");
        int intSayi1 = Integer.parseInt(sayi1);
        String sayi2 = girdi.substring(boslukIndex);
        sayi2 = sayi2.replace(" ", "");
        int intSayi2 = Integer.parseInt(sayi2);
        if (intSayi1 == intSayi2) {
            System.out.println("Sayilar esit");
        } else {
            System.out.println("Sayilar farkli");
        }
    }
}
