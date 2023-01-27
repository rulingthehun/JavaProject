package Gun37._07_Soru;

import Utility.MyFunc;

public class GeometriMain {
    public static void main(String[] args) {
        Kare k = new Kare();
        System.out.println("Kare cevre = " + k.cevre(4));
        System.out.println("Kare alan = " + k.alan(4));

        Dikdortgen d = new Dikdortgen();
        System.out.println("Dikdortgen cevre = " + d.cevre(3,5));
        System.out.println("Dikdortgen alan = " + d.alan(3,5));

        Daire daire = new Daire();
        System.out.println("Daire Cevre = " + daire.cevre(5.826));
        System.out.println("Daire Alan = " + daire.alan(5.8266546));

        System.out.println("Daire cevre yuvarla = "
                + MyFunc.yuvarla(daire.cevre(5.826)));
        System.out.println("Daire alan yuvarla= "
                + MyFunc.yuvarla(daire.alan(5.8266546)));
        System.out.printf("%-8.5f", daire.cevre(5.826));
        // printf : formatlı (toplam kaç hane ye yaz, noktadan sonra kaç hane kullan) yazdırma
        //  % : virgülden sonraki değişkeni gösteriyor
        // .  : ondalıklı bölümü gösteriyor
        // -  : sola dayalı , eklenmezse , sağa dayalı
        // 8  : toplamda ekrandan kaç digit kullanılacak
        // 5  : ondalıklı kısmından kaç hane alınacağını gösteriyor
        // f  : double veya float için kullanılıyor, tam sayılar için d kullanılır
        //      stringler için s kullanılır.
    }
}
