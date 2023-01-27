package Gun14;

import java.util.Scanner;

public class _03_forLoop {
    // kullanıcının gireceği bir rakama kadar olan sayıların toplamını bulunuz.
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        int toplam = 0;
        System.out.print("Sayi girin = ");
        int sinir = oku.nextInt();
        for (int i = 1; i < sinir; i++) {
            toplam = toplam + i;
        }
        System.out.println("toplam = " + toplam);
    }
}
