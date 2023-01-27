package Gun14;

import java.util.Scanner;

public class _06_Continue {
    // Kullanıcıdan 5 sayı isteyiniz.
    // Bu sayılardan 6 ile 10 arasındakiler hariç, diğerlerini toplasın.
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        int toplam = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Sayi girin = ");
            int sayi = oku.nextInt();
            if (sayi > 6 && sayi < 10) continue;
            toplam = toplam + sayi;
        }
        System.out.println("toplam = " + toplam);

    }
}
