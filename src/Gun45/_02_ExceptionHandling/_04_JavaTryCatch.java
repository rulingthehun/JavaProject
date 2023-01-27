package Gun45._02_ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _04_JavaTryCatch {
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

            } catch (InputMismatchException ex) { // Bu tip hatalar alirsa
                System.out.println("Lutfen sayi girin");
                i--;
            }
            catch (ArithmeticException ex) { // Bu tip hatalar alirsa
                System.out.println("Sifira bolme hatali");
                i--;
            }
            catch (Exception ex) { // Hata mesajlarini hata isimli Exception degiskenine attim
                System.out.println("Lutfen tekrar deneyiniz");
                i--;
            }
        }

        System.out.println("Program bitti");
    }
}