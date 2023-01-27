package Gun12;

import java.util.Scanner;

public class _06_Switch {
    public static void main(String[] args) {
        // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayti girin = ");
        int sayi = oku.nextInt();
        int onlar = (sayi % 100) / 10;
        //2. yontem aranan rakam sonda kalacak sekilde 10'un katina bol, mod 10 (%10) al.
        switch (onlar){
            case 0:
                System.out.println("Onlar basamagi sifir");break;
            case 1:
                System.out.println("Onlar basamagi bir");break;
            case 2:
                System.out.println("Onlar basamagi iki");break;
            case 3:
                System.out.println("Onlar basamagi uc");break;
            case 4:
                System.out.println("Onlar basamagi dort");break;
            case 5:
                System.out.println("Onlar basamagi bes");break;
            case 6:
                System.out.println("Onlar basamagi alti");break;
            case 7:
                System.out.println("Onlar basamagi yedi");break;
            case 8:
                System.out.println("Onlar basamagi sekiz");break;
            case 9:
                System.out.println("Onlar basamagi dokuz");break;
        }
    }
}
