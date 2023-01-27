package Gun36._04_Poly_Soru;

public class OkulMain {
    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci("Burak", "Gaznep",
                "Ogrenci", "A201");
        Calisan cal1 = new Calisan("Mert", "Gunhan",
                "Ogretmen", "Guzel sanatlar");
        Kisi.KimlikBelgesiYaz(ogr1);
        Kisi.KimlikBelgesiYaz(cal1);
    }
}
