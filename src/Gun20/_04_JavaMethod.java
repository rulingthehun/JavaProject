package Gun20;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {
        tekMiCiftMi(66);
        tekMiCiftMiOku();
    }

    public static void tekMiCiftMiOku() {
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi girin = ");
        int sayi = oku.nextInt();
        tekMiCiftMi(sayi);
    }

    public static void tekMiCiftMi(int sayi) {
        if (sayi % 2 == 0)
            System.out.println("Sayi cift");
        else {
            System.out.println("Sayi tek");
        }
    }
}