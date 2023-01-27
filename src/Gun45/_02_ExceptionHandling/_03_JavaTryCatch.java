package Gun45._02_ExceptionHandling;

import java.time.LocalDate;
import java.time.Month;

public class _03_JavaTryCatch {
    public static void main(String[] args) {

        System.out.println("Program basladi");

        try { //Dene
            LocalDate tarih = LocalDate.of(2022, Month.FEBRUARY, 30);
        } //Hata oldugu zaman programi kirma!
        catch (Exception ex){ //ex isimli degiskene olusan hatalarin bilgisi ataniyor
            System.out.println("Hata oliustu tekrar deneyin");
//            System.out.println("ex.toString() = " + ex.toString());
        }
        System.out.println("Program bitti");

        try{
            // Java çalışmaya devam
            // konuları öğrenmeye devam

        } // anlamadığın yer mi oldu ? kırılmadan DEVAM
        catch (Exception ex)
        {
            // hatanın sebebini anla
            // derse daha fazla odaklan
            // gereken videoları tekrar izle
            // arkadaşlarına hocana mutlaka sor
            // öğren ve kırılmadan devm et
        }

        //sonunda seni güzel bir meslek bekliyor
    }
}
