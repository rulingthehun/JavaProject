package Gun31._01_StaticModifier.Ornek1;

public class Ogrenci {
    String ad;
    String soyad;
    static String okulAd = "Ataturk Ilkokulu";
//    static = sen bir tanesin
//    Hepsi icin gecerli tek bir tane eleman
//    Tekrarlayan tum nesneler
//    icin STATIC kullaniyoruz.
//    static = sen bir tanesin
//    static hafizadan tasarruf saglar
//    Butun nesnelere atanir, hafizada tek
//    olarak bulunur
    public Ogrenci(String ad, String soyad){
        this.ad = ad;
        this.soyad = soyad;
//        this.okulAd = "Ataturk Ilkokulu";
//        500 kez ayni veri hafizada donuyordu, kotu hafiza kullanimi
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", Okul = '" + okulAd + "\'" +
                '}';
    }
}
