package Gun26;

import java.util.Scanner;

public class _01_JavaClassAndObject {
    //metodlarin yazilabilecegi yer
    public static void main(String[] args) {
        int sayi = 5;
        Scanner oku = new Scanner(System.in);
        Araba benimArabam = new Araba(); // Araba: tipi, benimArabam: degisken adi
        benimArabam.renk = "Kirmizi";
        benimArabam.modelYili = 1953;
        benimArabam.motorHacmi = 5000;
        benimArabam.plaka = "16HH1234";

        System.out.println("benimArabam.renk = " + benimArabam.renk);
        System.out.println("benimArabam.plaka = " + benimArabam.plaka);
        System.out.println("benimArabam.motorHacmi = " + benimArabam.motorHacmi);
        System.out.println("benimArabam.modelYili = " + benimArabam.modelYili);
    }
    //metodlarin yazilabilecegi yer
}

class Araba {
    int modelYili;
    String renk;
    double motorHacmi;
    String plaka;
}