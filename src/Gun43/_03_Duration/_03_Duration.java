package Gun43._03_Duration;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _03_Duration {
    public static void main(String[] args) {
//        Duration: Hem LocalTime hem de LocalDateTime'in kendi aralarindaki farki
//        verir yani saatin oldugu her zaman arasindaki farki bu sekilde buluruz

//        LocalTime
        LocalTime dersBaslangic = LocalTime.of(8, 30);
        LocalTime dersBitis = LocalTime.of(11, 15);

        Duration gunlukDersSaati = Duration.between(dersBaslangic, dersBitis);
        System.out.println("gunlukDersSaati = " + gunlukDersSaati);

        System.out.println("gunlukDersSaati.toHours() = " + gunlukDersSaati.toHours()); // Farkin toplam saat hali
        System.out.println("gunlukDersSaati.toMinutes() = " + gunlukDersSaati.toMinutes()); // Farkin toplam dakika hali
        System.out.println("gunlukDersSaati.toMillis() = " + gunlukDersSaati.toMillis()); // Farkin toplam milisaniye hali

//        LocalDateTime *** 2 tarih arasindaki fark ***
        LocalDateTime from = LocalDateTime.of(2022, 1, 1, 0,0);
        LocalDateTime to = LocalDateTime.now();

        Duration farkZaman = Duration.between(from, to);

        System.out.println("farkZaman = " + farkZaman);
        System.out.println("farkZaman.toDays() = " + farkZaman.toDays()); // Farkin toplam gunu
        System.out.println("farkZaman.toHours() = " + farkZaman.toHours()); // Farkin toplam saati
        System.out.println("farkZaman.toMinutes() = " + farkZaman.toMinutes()); // Farkin toplam dakikasi
    }
}
