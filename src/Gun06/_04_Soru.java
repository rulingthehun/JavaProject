package Gun06;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        //Girilen bir stringin sadece son harfini yazdirin.
        System.out.print("Bir kelime giriniz= ");
        Scanner oku = new Scanner(System.in);
        String girilen = oku.nextLine();
        int uzunluk = girilen.length();
        char sonHarf = girilen.charAt(uzunluk - 1);
        System.out.println("sonHarf = " + sonHarf);
        System.out.println("Son harf = " + girilen.charAt(girilen.length() - 1));
    }
}
