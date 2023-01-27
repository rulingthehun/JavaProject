package Gun45._02_ExceptionHandling;

import java.util.Scanner;

public class _02_JavaRuntimeException {
    public static void main(String[] args) {
        System.out.println("Program basladi");

        for (int i = 0; i < 3; i++) {
            Scanner oku = new Scanner(System.in);
            try {
                System.out.print("Sayi1 = ");
                int sayi1 = oku.nextInt();

                System.out.print("Sayi2 = ");
                int sayi2 = oku.nextInt();

                System.out.println("Bolum = " + (sayi1 / sayi2));

            } catch (Exception hata) { // Hata mesajlarini hata isimli Exception degiskenine attim
                System.out.println("Hata Get Message = " + hata.getMessage());
                i--;
            }
        }

        System.out.println("Program bitti");
    }
}