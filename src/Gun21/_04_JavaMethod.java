package Gun21;

import java.util.Scanner;

public class _04_JavaMethod {
    // kullanıcının gireceği bir sayıya kadar olan sayıların çarpımını (faktöryel)
    //bir fonksiyonda buldurup, bunun sonucunu main de tek mi çift mi olduğunu yazdırınız.
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Faktoriyeli alinacak sayi = ");
        int sayi = oku.nextInt();
        int carpim = faktoriyel(sayi);
        System.out.println("faktoriyel = " + faktoriyel(sayi));
        if (carpim%2==0)
            System.out.println("Cift");
        else
            System.out.println("Tek");
    }

    public static int faktoriyel(int girilenSayi) {
        int sonuc = 1;
        for (int i = 1; i <= girilenSayi; i++)
            sonuc *= i;
        return sonuc;
    }
}