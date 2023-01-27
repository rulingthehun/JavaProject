package Gun05;

import java.util.Scanner;

public class _16_Odev8 {
    //Bir byte oluşturunuz. Konsola kg cinsinden bir ağırlık yazınız. Byte'ı yazdırınız.
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Kac kilosunuz?");
        Byte kilo = oku.nextByte();
        System.out.println(kilo + " " + "Kilosunuz");
    }
}
/*
Cikti=
Kac kilosunuz?78
78 Kilosunuz
 */