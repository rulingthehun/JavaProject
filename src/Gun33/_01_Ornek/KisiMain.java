package Gun33._01_Ornek;

public class KisiMain {
    public static void main(String[] args) {
        Kisi kisi1 = new Kisi();
//        kisi1.ad = "Burak";
//        kisi1.soyad = "Gaznep";
//        kisi1.yas = 23;
        kisi1.setAd("Burak");
        kisi1.setSoyad("Gaznep");
        kisi1.yasAta(-25);
        System.out.println("kisi1.yasVer() = " + kisi1.yasVer());
        System.out.println("kisi1 = " + kisi1);
    }
//    Degiskene direkt erisimi kapatip
//    Bir method ile korumali veri gonderme ve alma
//    islemine Encapsulation denir.
}
