package Gun42._04_Soru;

import Utility.MyFunc;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Soru {
    public static void main(String[] args) {
//        Alinan saati geriye dogru 60sn saydiriniz
        LocalTime saat = LocalTime.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println("saat = " + saat.format(f));

        LocalTime saat2 = LocalTime.of(saat.getHour(), saat.getMinute(), 59);
        System.out.println("saat2.format(f) = " + saat2.format(f));

        int dakika = saat.getMinute();
        int saniye = saat.getSecond();
        int st = saat.getHour();

        for (int sn = saniye; sn >= 0; sn--) {
            saat2 = LocalTime.of(st, dakika, sn);
            System.out.print("\rsaat2 = " + saat2.format(f));
            MyFunc.Bekle(1);

            if (sn == 0) {
                dakika--;
                sn = 60;
            }

            if (dakika == -1) {
                st--;
                dakika = 59;
//                sn = 60;
            }
        }
    }
}
