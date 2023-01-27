package Gun42._03_Soru;

import Utility.MyFunc;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Soru {
    public static void main(String[] args) {
//        Canli digital saat yapiniz

        DateTimeFormatter f = DateTimeFormatter.ofPattern("h:mm:ss a");
        while (true) {
            LocalTime saat = LocalTime.now();
            System.out.print("\rSaat = " + saat.format(f));
            MyFunc.Bekle(1);
        }
    }
}
