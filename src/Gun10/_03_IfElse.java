package Gun10;

import java.util.Scanner;

public class _03_IfElse {
    // Girilen bir sayının tek mi çift mi olduğunu yazdırınız.
    public static void main(String[] args) {
        Scanner oku= new Scanner(System.in);
        System.out.print("Bir sayi girin = ");
        int sayi= oku.nextInt();
        if (sayi%2==0){
            System.out.print("Cift sayi");
        }
        else {
            System.out.print("Tek sayi");
        }
    }
}
