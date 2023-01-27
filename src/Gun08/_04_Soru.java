package Gun08;

import java.util.Scanner;

public class _04_Soru {
    //Girilen 3 basamaklı bir sayının basamaklarını bulunuz.
    public static void main(String[] args) {
        System.out.print("3 basamakli bir sayi girin = ");
        Scanner oku=new Scanner(System.in);
        int sayi= oku.nextInt();
        //%10 birler basamagini verir.
        //%100/10 onlar basamagini verir.
        ///100 yuzler basmagini verir.
        int birlerBasamagi = sayi %10;
        int onlarBasamagi = (sayi%100) / 10;
        int yuzlerBasamagi = sayi / 100;
        System.out.println("birlerBasamagi = " + birlerBasamagi);
        System.out.println("onlarBasamagi = " + onlarBasamagi);
        System.out.println("yuzlerBasamagi = " + yuzlerBasamagi);
    }
}