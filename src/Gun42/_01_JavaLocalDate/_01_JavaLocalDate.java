package Gun42._01_JavaLocalDate;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class _01_JavaLocalDate {
    public static void main(String[] args) {
        // LocalDate Sadece Gun, Ay, Yil bilgisi tutar.
        LocalDate tarih = LocalDate.now();
        System.out.println("tarih = " + tarih);
        System.out.println("tarih.getYear() = " + tarih.getYear());
        System.out.println("tarih.getMonth() = " + tarih.getMonth());
        System.out.println("tarih.getMonthValue() = " + tarih.getMonthValue());
        System.out.println("tarih.getDayOfMonth() = " + tarih.getDayOfMonth());
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek());
        System.out.println("tarih.getDayOfWeek().getValue() = " + tarih.getDayOfWeek().getValue());
        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear());

//        Defualt formatlar
        System.out.println("ISO_DATE = " + tarih.format(DateTimeFormatter.ISO_DATE));
        System.out.println("SHORT = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("MEDIUM = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("LONG = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("FULL = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

//        Localde aldigim tarihi istedigim ulkenin formatina, diline gore nasil gosteririz?
//        Ornegin localdeki saati Almanya'ya gore nasil gosteririm?
        System.out.println("FULL Locale GERMANY = " +
                tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMANY)));
        System.out.println("FULL Locale CHINESE = " +
                tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.CHINESE)));

//        en-US
//        en-UK
//        fr-CA
//        en-CA
//        Dil-Ulke

        Locale[] kullanilabilirLokaller = Locale.getAvailableLocales();
        for (Locale l:
             kullanilabilirLokaller) {
            System.out.println("Ulku = " + l.getDisplayCountry() + " - Dil = " + l.getDisplayLanguage());
            System.out.println("Dil Kodu = " + l.getLanguage() + " - Ulke kodu = " + l.getCountry());
        }

        Locale lokalIzlanda = new Locale("is", "IS");
        System.out.println("FULL Locale Iceland = " +
                tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(lokalIzlanda)));
        /***************************************************/

        System.out.println("\n**************Istedigim formatta gosterim**************");
//        Istedigim formatta gosterim
        System.out.println("tarih = " + tarih);

        DateTimeFormatter ozelFormat1 = DateTimeFormatter.ofPattern("dd/MM/yy");
        System.out.println("tarih.format(ozelFormat1) = " + tarih.format(ozelFormat1));

        DateTimeFormatter ozelFormat2 = DateTimeFormatter.ofPattern("EEE/D/MMM/y");
        System.out.println("tarih.format(ozelFormat2) = " + tarih.format(ozelFormat2));
        System.out.println("tarih.format(ozelFormat2) = " + tarih.format(ozelFormat2.withLocale(Locale.JAPAN)));

//        Kendimiz bir tarihi nasil set edebliriz, olusturabiliriz e.g int sayi = 5
        LocalDate tarih1 = LocalDate.of(2020, 6, 1);
        LocalDate tarih2 = LocalDate.of(2021, Month.DECEMBER, 6);
        System.out.println("tarih1.format(ozelFormat1) = " + tarih1.format(ozelFormat1));
        System.out.println("tarih2.format(ozelFormat2) = " + tarih2.format(ozelFormat2.withLocale(Locale.TRADITIONAL_CHINESE)));
    }
}
