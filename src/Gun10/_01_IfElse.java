package Gun10;

import java.util.Scanner;

public class _01_IfElse {
    //Girilen bir ogrencinin notuna gore 50'den buyuk esit ise gectiniz.
    //kucuk ise kaldiniz yazdir.
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Ogr notu = ");
        int not = oku.nextInt();
        if (not >= 50) {
            System.out.println("Tebrikler gectiniz"); //evet cikisi
        }
        else {
            System.out.println("Tebrikler yaz okulu kazandiniz"); //hayir cikisi
        }
    }
}
