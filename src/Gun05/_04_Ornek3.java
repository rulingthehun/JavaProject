package Gun05;

import java.util.Scanner;

public class _04_Ornek3 {
    public static void main(String[] args) {
        // Kullanıcıdan Adını ve soyadını ayrı ayrı okutarak alıp
        // birlikte ekrana yazdırnız.
        Scanner oku = new Scanner(System.in);
        System.out.print("Adinizi girin ");
        String ad = oku.next();
        System.out.print("Soyadinizi girin ");
        String soyad = oku.next();
        System.out.println("ad soyad = " + ad + " " + soyad);
    }
}
/*
Cikti
Adinizi girin Burak
Soyadinizi girin Gaznep
ad soyad = Burak Gaznep
 */