package Gun05;

import java.util.Scanner;

public class _02_Ornek1 {
    public static void main(String[] args) {
        //Girilen bir adi erkrana yazdirin.
        Scanner okuyucu=new Scanner(System.in);
        System.out.print("Adinizi giriniz=");
        String ad=okuyucu.next(); //next() -> Bir kelime okuma
        System.out.println("ad = " + ad);
        /*
        oku.next() -> bir kelime okuyor (char)
        oku.nextLine() -> tum satiri okur
        oku.nextInt() -> int degeri okur
        oku.nextByte() -> byte degeri okur
        oku.nextLong() -> long degeri okur
        oku.nextShort() -> short degeri oku

        oku.nextFloat() -> float degeri oku
        oku.nextDouble() -> double degeri oku
         */
    }
}
