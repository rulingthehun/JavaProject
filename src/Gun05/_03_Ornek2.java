package Gun05;

import java.util.Scanner;

public class _03_Ornek2 {
    //Kullanicinin Adini ve Soyadini ekrana yazdirin
    public static void main(String[] args) {
        Scanner okuyucu=new Scanner(System.in); //Okuma islemini yapacak degisken tanimlandi.
        System.out.print("Adinizi ve soyadini girin="); //ekrana neyin girilecegini yazdik
        String adSoyad=okuyucu.nextLine(); //okuma islemi bu noktada yapiliyor
        System.out.println("Ad Soyad = " + adSoyad); //verinin gercekten okunabildigini tekrar yazarak kontrol ettik.
    }
}
