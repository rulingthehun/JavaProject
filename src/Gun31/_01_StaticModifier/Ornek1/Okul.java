package Gun31._01_StaticModifier.Ornek1;

public class Okul {
    public static void main(String[] args) {
//        Ogrenci ogr1 = new Ogrenci("Burak", "Gaznepoglu", "Ataturk Ilkokulu");
//        Ayni veri 500 kez giris yapiliyordu, bunu engellemek icin once cons. atildi


        Ogrenci ogr1 = new Ogrenci("Burak", "Gaznepoglu");
        Ogrenci ogr2 = new Ogrenci("Mert", "Gunhan");
        Ogrenci ogr3 = new Ogrenci("Can", "Sungur");
//        ...
//        ...
        Ogrenci ogr499 = new Ogrenci("Yigitcan", "Erdogan");
        Ogrenci ogr500 = new Ogrenci("Tancan", "Fumen");
        System.out.println("ogr1 = " + ogr1);
//        Ayni verinin coklu girisi engellendi
//        Ayni verinin hafizada NESNE sayisi kadar tekrarlanmasi engellendi
    }
}
