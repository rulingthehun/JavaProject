package Gun05;

import java.util.Scanner;

public class _09_Odev1 {
    public static void main(String[] args) {
        //Bir String oluşturun. Konsol'a isminizi girin.İsminizi yazdırın.
        Scanner oku = new Scanner(System.in);
        System.out.print("Isminizi girin=");
        String ad = oku.next();
        System.out.println("Isminiz = " + ad);
    }
}
/*
cikti=
Isminizi girin=Burak
Isminiz = Burak
 */