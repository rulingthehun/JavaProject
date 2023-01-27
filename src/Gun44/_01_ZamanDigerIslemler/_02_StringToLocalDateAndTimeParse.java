package Gun44._01_ZamanDigerIslemler;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _02_StringToLocalDateAndTimeParse {
    public static void main(String[] args) {
//        Kullanicidan alinan ve Stirng durumda olan bir time veya tarih
//        bilgisinin time veya tarih degiskenine cevirilmesi
        long startTime = System.currentTimeMillis();
        Scanner oku = new Scanner(System.in);
        System.out.print("Tarih giriniz (eg. 25 01 2020) = ");
        String strTarih = oku.nextLine();

//        Kullanicinin girecegi formata gore format olusturduk
//        Amac: Kullanicin girdigi Stringi LocalDate degiskenine uygun hale getirmek
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd MM yyyy");

//        Stringin formati bu formata uygun olmali, parse ile cevirdik
        LocalDate tarih = LocalDate.parse(strTarih, f);

        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd-MMM-yy");
        System.out.println("Tarih = " + tarih.format(f2));
        long finishTime = System.currentTimeMillis();
        System.out.println("Gecen sure = " + (finishTime-startTime) + " ms");
    }
}
