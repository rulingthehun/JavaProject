package Gun05;

import java.util.Scanner;

public class _14_Odev6 {
    //Bir string oluşturunuz. Doğum gününüzü konsola giriniz. String'i yazdırınız.
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Dogum gununuz nedir?");
        String dogum = oku.nextLine();
        System.out.println("Dogum gununuz= " + dogum);
    }
}
/*
Cikti=
Dogum gununuz nedir?9 Ocak 1999
Dogum gununuz= 9 Ocak 1999
 */