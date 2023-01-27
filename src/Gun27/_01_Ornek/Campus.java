package Gun27._01_Ornek;

public class Campus {
    // Bir kampus programı için asagıdaki özellikte bilgilerin
    // kaydedileceği clasları yazınız.
    // Okul :  adı, mudurAdi, ucreti(double)
    // Ogrenci : okulNo, tamAd, okulu

    // bu şekilde 1 öğrenci tanımlayıp bütün bilgileri kendiniz atayıp
    // yazdırınız.
    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci();
        ogr1.okulNo = 1;
        ogr1.tamAd = "Mert Gunhan";
        ogr1.okulu = new Okul();
        ogr1.okulu.adi = "Ataturk okulu";
        ogr1.okulu.mudurAdi = "Can Sungur";
        ogr1.okulu.ucreti = 100000;

        System.out.println("ogr1.tamAd = " + ogr1.tamAd);
        System.out.println("ogr1.okulNo = " + ogr1.okulNo);
        System.out.println("ogr1.okulu.adi = " + ogr1.okulu.adi);
        System.out.println("ogr1.okulu.mudurAdi = " + ogr1.okulu.mudurAdi);
        System.out.println("ogr1.okulu.ucreti = " + ogr1.okulu.ucreti);
    }
}
