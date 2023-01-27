package Gun14;

import java.util.Scanner;

public class _04_forLoop {
    // Girilen bir sayıya(dahil) kadar olan sayıların çarpımını bulunuz
    //2. bolum: Carpimin degeri 100'u gectiginde islem sonlansin.
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Sinir kac olsun = ");
        int sinir = oku.nextInt();
        long carpim = 1;
        for (int i = 1; i <= sinir; i++) {
            carpim = carpim * i;
            if (carpim > 100) {
                break;
            }
        }
        System.out.println("carpim = " + carpim);
    }
}
