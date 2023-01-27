package Gun10;

import java.util.Scanner;

public class _04_MantiksalIfadeler {
    //Mantiksal (Lojik) ifadeler
    // && = ve
    // || = veya
    // Girilen sayı pozitif ve tek ise , ekrana uygun sayı girildi
    // degilse uygun sayı girilmedi yazdırınız.

    // hem tek hem pozitif  ->  (sayi%2 == 1) && (sayi > 0)
    public static void main(String[] args) {
        Scanner oku= new Scanner(System.in);
        System.out.print("Sayi = ");
        int sayi= oku.nextInt();
        if ( sayi%2==1 && sayi>0){
            System.out.print("Uygun sayi girildi");
        }
        else {
            System.out.print("Uygun sayi GIRILMEDI");
        }
    }
}
