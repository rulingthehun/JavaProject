package Gun43._02_Period;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class _02_Period {
    public static void main(String[] args) {
//        2 tarih arasindaki zaman farki gosterir
//        LocalDate ler icin kullanilir

        LocalDate dogumTarihi = LocalDate.of(1999, 1, 9);
        LocalDate buGun = LocalDate.now();

        Period fark = Period.between(dogumTarihi, buGun);
        System.out.println("fark = " + fark);

        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());

        System.out.println(fark.getYears() + " yasindasin");

        /************/

        Period period3Gun = Period.ofDays(3);
        Period period3Ay = Period.ofMonths(3);

        LocalDate ucGunSonra = buGun.plus(period3Gun); //Zaman araligi ekleme
        LocalDate ucAySonra = buGun.plus(period3Ay);

        System.out.println("ucGunSonra = " + ucGunSonra);
        System.out.println("ucAySonra = " + ucAySonra);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd.MM.yyyy");


        /**************************/
//        Ornek: Kursun suresini ve bitis suresini bulunuz (6 ay)
//        Ne kadar sure kaldi?

        LocalDate buGun2 = LocalDate.now();
        LocalDate kursBaslangic = LocalDate.of(2022, 7, 25);
        Period kursSuresi = Period.ofMonths(6);
        LocalDate kursBitis = kursBaslangic.plus(kursSuresi);
        Period gecenGun = Period.between(kursBaslangic, buGun2);

        Period kalanGun = Period.between(buGun2, kursBitis);
        System.out.println("kursBaslangic = " + kursBaslangic);
        System.out.println("Gecen Gun = " + gecenGun.getMonths() + " ay, " + gecenGun.getDays() + " gun");
        System.out.println("kursBitis = " + kursBitis);
        System.out.println("Kurs Bitis gunu = " + kursBitis.getDayOfWeek());
        System.out.println("Kalan Gun = " + kalanGun.getDays() + " gun");
    }
}
